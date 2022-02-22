package com.rsosor.ec.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * 動態權限相關業務類
 *
 * @author RsosoR
 * @date 2022/2/22
 */
public interface DynamicSecurityService {

    /**
     * 加載資源 ANT 通配符和資源對應 MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
