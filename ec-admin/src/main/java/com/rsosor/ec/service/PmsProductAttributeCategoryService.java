package com.rsosor.ec.service;

import com.rsosor.ec.dto.PmsProductAttributeCategoryItem;
import com.rsosor.ec.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 商品屬性分類管理 Service
 *
 * @author RsosoR
 * @date 2022/1/17
 */
public interface PmsProductAttributeCategoryService {

    /**
     * 創建屬性分類
     */
    int create(String name);

    /**
     * 修改屬性分類
     */
    int update(Long id, String name);

    /**
     * 刪除屬性分類
     */
    int delete(Long id);

    /**
     * 獲取屬性分類詳情
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分頁查詢屬性分類
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * 獲取包含屬性的屬性分類
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
