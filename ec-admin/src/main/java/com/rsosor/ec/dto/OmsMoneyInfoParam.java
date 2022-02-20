package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 修改訂單費用訊息參數
 *
 * @author RsosoR
 * @date 2022/2/20
 */
@Getter
@Setter
public class OmsMoneyInfoParam {

    @ApiModelProperty(value = "訂單 ID")
    private Long orderId;

    @ApiModelProperty(value = "運費金額")
    private BigDecimal freightAmount;

    @ApiModelProperty(value = "管理員後台調整訂單所使用的折扣金額")
    private BigDecimal discountAmount;

    @ApiModelProperty(value = "訂單狀態：0->待付款；1->待發貨；2->已發貨；3->已完成；4->已關閉；5->無效訂單")
    private Integer status;
}
