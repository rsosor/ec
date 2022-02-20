package com.rsosor.ec.dto;

import com.rsosor.ec.model.OmsOrderItem;
import com.rsosor.ec.model.OmsOrderOperateHistory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 訂單詳情訊息
 *
 * @author RsosoR
 * @date 2022/2/20
 */
@Getter
@Setter
public class OmsOrderDetail {

    @ApiModelProperty(value = "訂單商品列表")
    private List<OmsOrderItem> orderItemList;

    @ApiModelProperty(value = "訂單操作記錄列表")
    private List<OmsOrderOperateHistory> historyList;
}
