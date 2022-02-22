package com.rsosor.ec.service;

import com.rsosor.ec.dto.UmsMenuNode;
import com.rsosor.ec.model.UmsMenu;

import java.util.List;

/**
 * 後台菜單管理 Service
 *
 * @author RsosoR
 * @date 2022/2/22
 */
public interface UmsMenuService {

    /**
     * 創建後台菜單
     */
    int create(UmsMenu umsMenu);

    /**
     * 修改後台菜單
     */
    int update(Long id, UmsMenu umsMenu);

    /**
     * 根據 ID 獲取菜單詳情
     */
    UmsMenu getItem(Long id);

    /**
     * 根據 ID 刪除後台菜單
     */
    int delete(Long id);

    /**
     * 分頁查詢後台菜單
     */
    List<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 樹型結構返回所有菜單列表
     */
    List<UmsMenuNode> treeList();

    /**
     * 修改菜單顯示狀態
     */
    int updateHidden(Long id, Integer hidden);
}
