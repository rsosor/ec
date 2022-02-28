package com.rsosor.ec.search.dao;

import com.rsosor.ec.search.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索商品管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/28
 */
public interface EsProductDao {

    /**
     * 獲取指定 ID 的搜索商品
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
