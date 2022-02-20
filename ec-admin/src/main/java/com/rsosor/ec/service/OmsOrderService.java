package com.rsosor.ec.service;

import com.rsosor.ec.dto.*;
import com.rsosor.ec.model.OmsOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 訂單管理 Service
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public interface OmsOrderService {

    /**
     * 訂單查詢
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量發貨
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量關閉訂單
     */
    @Transactional
    int close (List<Long> ids, String note);

    /**
     * 批量刪除訂單
     */
    int delete(List<Long> ids);

    /**
     * 獲取指定訂單詳情
     */
    OmsOrderDetail detail(Long id);

    /**
     * 修改訂單收貨人訊息
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * 修改訂單費用訊息
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * 修改訂單備註
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);
}
