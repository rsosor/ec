package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * 用戶註冊參數
 *
 * @author RsosoR
 * @date 2022/2/14
 */
@Getter
@Setter
public class UmsAdminParam {

    @NotEmpty
    @ApiModelProperty(value = "用戶名", required = true)
    private String username;

    @NotEmpty
    @ApiModelProperty(value = "密碼", required = true)
    private String password;

    @ApiModelProperty(value = "用戶頭像")
    private String icon;

    @Email
    @ApiModelProperty(value = "信箱")
    private String email;

    @ApiModelProperty(value = "用戶暱稱")
    private String nickName;

    @ApiModelProperty(value = "備註")
    private String note;
}
