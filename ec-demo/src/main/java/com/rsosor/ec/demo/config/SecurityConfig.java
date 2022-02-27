package com.rsosor.ec.demo.config;

import com.rsosor.ec.demo.bo.AdminUserDetails;
import com.rsosor.ec.mapper.UmsAdminMapper;
import com.rsosor.ec.model.UmsAdmin;
import com.rsosor.ec.model.UmsAdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * SpringSecurity 相關配置
 *
 * @author RsosoR
 * @date 2022/2/26
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                    // 配置權限
                    // .antMatchers("/").access("hasRole("TEST")")      // 該路徑需要 TEST 角色
                    // .antMatchers("/brand/list").hasAuthority("TEST") // 該路徑需要 TEST 權限
                .antMatchers("/**").permitAll()
                .and()  // 啟用基於 http 的認證
                .httpBasic()
                .realmName("/")
                .and()  // 配置登錄頁面
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error=true")
                .and()  // 配置退出路徑
                .logout()
                .logoutSuccessUrl("/")
                    // .and()   // 記住密碼功能
                    // .rememberMe()
                    // .tokenValiditySeconds(60*60*24)
                    // .key("rememberMeKey")
                .and()  // 關閉跨域偽造
                .csrf()
                .disable()
                .headers()
                .frameOptions()
                .disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    protected UserDetailsService userDetailsService() {
        // 獲取登錄用戶訊息
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
                UmsAdminExample example = new UmsAdminExample();
                example.createCriteria().andUsernameEqualTo(s);
                List<UmsAdmin> umsAdminList = umsAdminMapper.selectByExample(example);
                if (umsAdminList != null && umsAdminList.size() > 0) {
                    return new AdminUserDetails(umsAdminList.get(0));
                }
                throw new UsernameNotFoundException("用戶名或密碼錯誤");
            }
        };
    }
}
