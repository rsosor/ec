package com.rsosor.ec.service;

import com.rsosor.ec.model.UmsResourceCategory;

import java.util.List;

/**
 * 後台資源分類管理 Service
 *
 * @author RsosoR
 * @date 2022/2/22
 */
public interface UmsResourceCategoryService {

    /**
     * 獲取所有資源分類
     */
    List<UmsResourceCategory> listAll();

    /**
     * 創建資源分類
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改資源分類
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 刪除資源分類
     */
    int delete(Long id);
}
