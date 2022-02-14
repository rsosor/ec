package com.rsosor.ec.dao;

import com.rsosor.ec.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品參數/規格屬性自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface PmsProductAttributeValueDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
