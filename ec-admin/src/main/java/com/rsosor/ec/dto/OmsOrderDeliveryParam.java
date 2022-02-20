package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 訂單發貨參數
 *
 * @author RsosoR
 * @date 2022/2/20
 */
@Getter
@Setter
public class OmsOrderDeliveryParam {

    @ApiModelProperty(value = "訂單 id")
    private Long orderId;

    @ApiModelProperty(value = "物流公司")
    private String deliveryCompany;

    @ApiModelProperty(value = "物流單號")
    private String deliverySn;
}
