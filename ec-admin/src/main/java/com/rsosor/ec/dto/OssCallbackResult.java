package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * OSS 上傳文件的回調結果
 *
 * @author RsosoR
 * @date 2022/2/22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OssCallbackResult {

    @ApiModelProperty("文件名稱")
    private String filename;

    @ApiModelProperty("文件大小")
    private String size;

    @ApiModelProperty("文件的 mimeType")
    private String mimeType;

    @ApiModelProperty("圖片文件的寬")
    private String width;

    @ApiModelProperty("圖片文件的高")
    private String height;
}
