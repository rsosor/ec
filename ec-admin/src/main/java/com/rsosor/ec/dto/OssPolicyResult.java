package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 獲取 OSS 上傳文件授權返回結果
 *
 * @author RsosoR
 * @date 2022/2/22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OssPolicyResult {

    @ApiModelProperty("訪問身份驗證中用到用戶標示")
    private String accessKeyId;

    @ApiModelProperty("用戶表單上傳的策略，經過 base64 編碼過的字符串")
    private String policy;

    @ApiModelProperty("對 policy 簽名後的字符串")
    private String signature;

    @ApiModelProperty("上傳文件夾路徑前缀")
    private String dir;

    @ApiModelProperty("oss 對外服務的訪問域名")
    private String host;

    @ApiModelProperty("上傳成功後的回調設置")
    private String callback;
}
