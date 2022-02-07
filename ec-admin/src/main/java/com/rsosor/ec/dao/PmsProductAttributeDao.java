package com.rsosor.ec.dao;

import com.rsosor.ec.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品屬性管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/8
 */
public interface PmsProductAttributeDao {

    /**
     * 獲取商品屬性訊息
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
