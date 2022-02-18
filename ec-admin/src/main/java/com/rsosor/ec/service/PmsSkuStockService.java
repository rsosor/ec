package com.rsosor.ec.service;

import com.rsosor.ec.model.PmsSkuStock;

import java.util.List;

/**
 * 商品 SKU 庫存管理 Service
 *
 * @author RsosoR
 * @date 2022/2/14
 */
public interface PmsSkuStockService {

    /**
     * 根據產品 id 和 skuCode 關鍵字模糊搜索
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * 批量更新商品庫存訊息
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
