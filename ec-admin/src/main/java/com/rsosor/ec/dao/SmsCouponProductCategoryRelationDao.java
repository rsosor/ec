package com.rsosor.ec.dao;

import com.rsosor.ec.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 優惠券和商品分類關係管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public interface SmsCouponProductCategoryRelationDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list")List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
