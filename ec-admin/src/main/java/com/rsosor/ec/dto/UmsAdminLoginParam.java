package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * 用戶登錄參數
 *
 * @author RsosoR
 * @date 2022/2/18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsAdminLoginParam {

    @NotEmpty
    @ApiModelProperty(value = "用戶名", required = true)
    private String username;

    @NotEmpty
    @ApiModelProperty(value = "密碼", required = true)
    private String password;
}
