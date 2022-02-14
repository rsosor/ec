package com.rsosor.ec.service;

import com.rsosor.ec.dto.PmsProductParam;
import com.rsosor.ec.dto.PmsProductQueryParam;
import com.rsosor.ec.dto.PmsProductResult;
import com.rsosor.ec.model.PmsProduct;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品管理 Service
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface PmsProductService {

    /**
     * 創建商品
     * @param productParam
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(PmsProductParam productParam);

    /**
     * 根據商品編號獲取更新訊息
     * @param id
     * @return
     */
    PmsProductResult getUpdateInfo(Long id);

    /**
     * 更新商品
     * @param id
     * @param productParam
     * @return
     */
    @Transactional
    int update(Long id, PmsProductParam productParam);

    /**
     * 分頁查詢商品
     * @param productQueryParam
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量修改審核狀態
     * @param ids
     * @param verifyStatus
     * @param detail
     * @return
     */
    @Transactional
    int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail);

    /**
     * 批量修改商品上架狀態
     * @param ids
     * @param publishStatus
     * @return
     */
    int updatePublishStatus(List<Long> ids, Integer publishStatus);

    /**
     * 批量修改商品推薦狀態
     * @param ids
     * @param recommendStatus
     * @return
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 批量修改新品狀態
     * @param ids
     * @param newStatus
     * @return
     */
    int updateNewStatus(List<Long> ids, Integer newStatus);

    /**
     * 批量刪除商品
     * @param ids
     * @param deleteStatus
     * @return
     */
    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    /**
     * 根據商品名稱或者貨號模糊查詢
     * @param keyword
     * @return
     */
    List<PmsProduct> list(String keyword);
}
