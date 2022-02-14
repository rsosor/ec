package com.rsosor.ec.dao;

import com.rsosor.ec.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品滿減自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface PmsProductFullReductionDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list")List<PmsProductFullReduction> productFullReductionList);
}
