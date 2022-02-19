package com.rsosor.ec.service;

import com.rsosor.ec.dto.SmsCouponParam;
import com.rsosor.ec.model.SmsCoupon;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 優惠券管理 Service
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public interface SmsCouponService {

    /**
     * 添加優惠券
     */
    @Transactional
    int create(SmsCouponParam couponParam);

    /**
     * 根據優惠券 id 刪除優惠券
     */
    @Transactional
    int delete(Long id);

    /**
     * 根據優惠券 id 更新優惠券訊息
     */
    @Transactional
    int update(Long id, SmsCouponParam couponParam);

    /**
     * 分頁獲取優惠券列表
     */
    List<SmsCoupon> list(String name, Integer type, Integer pageNum, Integer pageSize);

    /**
     * 獲取優惠券詳情
     */
    SmsCouponParam getItem(Long id);
}
