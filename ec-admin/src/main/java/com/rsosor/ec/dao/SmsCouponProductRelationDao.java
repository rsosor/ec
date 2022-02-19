package com.rsosor.ec.dao;

import com.rsosor.ec.model.SmsCouponProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 優惠券和商品關係自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public interface SmsCouponProductRelationDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list")List<SmsCouponProductRelation> productRelationList);
}
