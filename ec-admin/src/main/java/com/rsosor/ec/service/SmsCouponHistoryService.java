package com.rsosor.ec.service;

import com.rsosor.ec.model.SmsCouponHistory;

import java.util.List;

/**
 * 優惠券領取記錄管理 Service
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface SmsCouponHistoryService {

    /**
     * 分頁查詢優惠券領取記錄
     */
    List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);
}
