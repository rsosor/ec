package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * OSS 上傳成功後的回調參數
 *
 * @author RsosoR
 * @date 2022/2/22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OssCallbackParam {

    @ApiModelProperty("請求的回調地址")
    private String callbackUrl;

    @ApiModelProperty("回調時傳入 request 中的參數")
    private String callbackBody;

    @ApiModelProperty("回調時傳入參數的格式，比如表單提交形式")
    private String callbackBodyType;
}
