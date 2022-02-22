package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件上傳返回結果
 *
 * @author RsosoR
 * @date 2022/2/22
 */
@Data
@EqualsAndHashCode
public class MinioUploadDto {

    @ApiModelProperty("文件訪問 URL")
    private String url;

    @ApiModelProperty("文件名稱")
    private String name;
}
