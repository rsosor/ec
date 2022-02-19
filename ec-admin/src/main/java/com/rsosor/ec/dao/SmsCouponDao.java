package com.rsosor.ec.dao;

import com.rsosor.ec.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 優惠券管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public interface SmsCouponDao {

    /**
     * 獲取優惠券詳情包括綁定關係
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
