package com.rsosor.ec.dao;

import com.rsosor.ec.model.PmsProductCategoryAttributeRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品分類和屬性關係自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/8
 */
public interface PmsProductCategoryAttributeRelationDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation>productCategoryAttributeRelationList);
}
