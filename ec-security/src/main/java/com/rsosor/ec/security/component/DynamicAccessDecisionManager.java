package com.rsosor.ec.security.component;

import cn.hutool.core.collection.CollUtil;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Iterator;

/**
 * 動態權限決策管理器，用於判斷用戶是否有訪問權限
 *
 * @author RsosoR
 * @date 2022/2/23
 */
public class DynamicAccessDecisionManager implements AccessDecisionManager {

    @Override
    public void decide(Authentication authentication, Object o,
                       Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        // 當介面未被配置資源時直接放行
        if (CollUtil.isEmpty(collection)) {
            return;
        }
        Iterator<ConfigAttribute> iterator = collection.iterator();
        while (iterator.hasNext()) {
            ConfigAttribute configAttribute = iterator.next();
            // 將訪問所需資源或用戶擁有資源進行比對
            String needAuthority = configAttribute.getAttribute();
            for (GrantedAuthority grantedAuthority : authentication.getAuthorities()) {
                if (needAuthority.trim().equals(grantedAuthority.getAuthority())) {
                    return;
                }
            }
        }
        throw new AccessDeniedException("抱歉，您沒有訪問權限");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        // false -> true
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        // false -> true
        return true;
    }
}
