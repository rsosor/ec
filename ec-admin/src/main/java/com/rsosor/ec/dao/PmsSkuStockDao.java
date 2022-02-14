package com.rsosor.ec.dao;

import com.rsosor.ec.model.PmsSkuStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品 SKU 管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface PmsSkuStockDao {

    /**
     * 批量插入操作
     */
    int insertList(@Param("list")List<PmsSkuStock> skuStockList);

    /**
     * 批量插入或替換操作
     */
    int replaceList(@Param("list") List<PmsSkuStock> skuStockList);
}
