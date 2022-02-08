package com.rsosor.ec.dao;

import com.rsosor.ec.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分類自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/8
 */
public interface PmsProductCategoryDao {

    /**
     * 獲取商品分類及其子分類
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
