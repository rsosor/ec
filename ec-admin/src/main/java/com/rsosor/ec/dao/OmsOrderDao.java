package com.rsosor.ec.dao;

import com.rsosor.ec.dto.OmsOrderDeliveryParam;
import com.rsosor.ec.dto.OmsOrderDetail;
import com.rsosor.ec.dto.OmsOrderQueryParam;
import com.rsosor.ec.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 訂單查詢自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/20
 */
public interface OmsOrderDao {

    /**
     * 條件查詢訂單
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量發貨
     */
    int delivery(@Param("list")List<OmsOrderDeliveryParam>deliveryParamList);

    /**
     * 獲取訂單詳情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
