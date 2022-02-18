package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 修改用戶名密碼參數
 *
 * @author RsosoR
 * @date 2022/2/14
 */
@Getter
@Setter
public class UpdateAdminPasswordParam {

    @NotEmpty
    @ApiModelProperty(value = "用戶名", required = true)
    private String username;

    @NotEmpty
    @ApiModelProperty(value = "舊密碼", required = true)
    private String oldPassword;

    @NotEmpty
    @ApiModelProperty(value = "新密碼", required = true)
    private String newPassword;
}
