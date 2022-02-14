package com.rsosor.ec.service;

import com.rsosor.ec.dto.PmsProductCategoryParam;
import com.rsosor.ec.dto.PmsProductCategoryWithChildrenItem;
import com.rsosor.ec.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品分類管理 Service
 *
 * @author RsosoR
 * @date 2022/2/8
 */
public interface PmsProductCategoryService {

    /**
     * 創建商品分類
     * @param pmsProductCategoryParam
     * @return
     */
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 修改商品分類
     * @param id
     * @param pmsProductCategoryParam
     * @return
     */
    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 分頁獲取商品分類
     * @param parentId
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 刪除商品分類
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 根據 ID 獲取商品分類
     * @param id
     * @return
     */
    PmsProductCategory getItem(Long id);

    /**
     * 批量修改導航狀態
     * @param ids
     * @param navStatus
     * @return
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * 批量修改顯示狀態
     * @param ids
     * @param showStatus
     * @return
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 以層級形式獲取商品分類
     * @return
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
