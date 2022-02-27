package com.rsosor.ec.demo.bo;

import com.rsosor.ec.model.UmsAdmin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

/**
 * SpringSecurity 需要的用戶詳情
 *
 * @author RsosoR
 * @date 2022/2/26
 */
public class AdminUserDetails implements UserDetails {

    private UmsAdmin umsAdmin;

    public AdminUserDetails(UmsAdmin umsADmin) {
        this.umsAdmin = umsADmin;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 返回當前用戶的權限
        return Arrays.asList(new SimpleGrantedAuthority("TEST"));
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
