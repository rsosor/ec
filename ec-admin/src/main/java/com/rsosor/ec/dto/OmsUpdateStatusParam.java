package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 確認收貨請求參數
 *
 * @author RsosoR
 * @date 2022/2/20
 */
@Getter
@Setter
public class OmsUpdateStatusParam {

    @ApiModelProperty("服務單號")
    private Long id;

    @ApiModelProperty("收貨地址關聯 id")
    private Long companyAddressId;

    @ApiModelProperty("確認退款金額")
    private BigDecimal returnAmount;

    @ApiModelProperty("處理備註")
    private String handleNote;

    @ApiModelProperty("處理人")
    private String handleMan;

    @ApiModelProperty("收貨備註")
    private String receiveNote;

    @ApiModelProperty("收貨人")
    private String receiveMan;

    @ApiModelProperty("申請狀態：1->退貨中；2->已完成；3->已拒絕")
    private Integer status;
}
