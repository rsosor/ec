package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 訂單退貨申請查詢參數
 *
 * @author RsosoR
 * @date 2022/2/20
 */
@Getter
@Setter
public class OmsReturnApplyQueryParam {

    @ApiModelProperty("服務單號")
    private Long id;

    @ApiModelProperty(value = "收貨人姓名/號碼")
    private String receiverKeyword;

    @ApiModelProperty(value = "訂單狀態：0->待處理；1->退貨中；2->已完成；3->已拒絕")
    private Integer status;

    @ApiModelProperty(value = "申請時間")
    private String createTime;

    @ApiModelProperty(value = "處理人員")
    private String handleMan;

    @ApiModelProperty(value = "處理時間")
    private String handleTime;
}
