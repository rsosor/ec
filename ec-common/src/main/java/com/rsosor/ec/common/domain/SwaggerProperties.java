package com.rsosor.ec.common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Swagger 自定義配置
 *
 * @author RsosoR
 * @date 2022/1/23
 */
@Data
@EqualsAndHashCode
@Builder
public class SwaggerProperties {

    /**
     * API 文檔生成基礎路徑
     */
    private String apiBasePackage;

    /**
     * 是否要啟用登錄認證
     */
    private boolean enableSecurity;

    /**
     * 文檔標題
     */
    private String title;

    /**
     * 文檔描述
     */
    private String description;

    /**
     * 文檔版本
     */
    private String version;

    /**
     * 文檔聯絡人姓名
     */
    private String contactName;

    /**
     * 文檔聯絡人網指
     */
    private String contactUrl;

    /**
     * 文檔聯絡人郵件
     */
    private String contactEmail;
}
