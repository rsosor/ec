package com.rsosor.ec.dao;

import com.rsosor.ec.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 商品屬性分類管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/1/25
 */
public interface PmsProductAttributeCategoryDao {

    /**
     * 獲取包含屬性的商品屬性分類
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
