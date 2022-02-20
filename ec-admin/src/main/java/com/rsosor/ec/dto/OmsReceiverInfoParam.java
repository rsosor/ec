package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 訂單修改收貨人訊息參數
 *
 * @author RsosoR
 * @date 2022/2/20
 */
@Getter
@Setter
public class OmsReceiverInfoParam {

    @ApiModelProperty(value = "訂單 ID")
    private Long orderId;

    @ApiModelProperty(value = "收貨人姓名")
    private String receiverName;

    @ApiModelProperty(value = "收貨人電話")
    private String receiverPhone;

    @ApiModelProperty(value = "收貨人郵編")
    private String receiverPostCode;

    @ApiModelProperty(value = "詳細地址")
    private String receiverDetailAddress;

    @ApiModelProperty(value = "省分/直轄市")
    private String receiverProvince;

    @ApiModelProperty(value = "城市")
    private String receiverCity;

    @ApiModelProperty(value = "區")
    private String receiverRegion;

    @ApiModelProperty(value = "訂單狀態：0->待付款；1->待發貨；2->已發貨；3->已完成；4->已關閉；5->無效訂單")
    private Integer status;
}
