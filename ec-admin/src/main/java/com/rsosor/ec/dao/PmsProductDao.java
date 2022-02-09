package com.rsosor.ec.dao;

import com.rsosor.ec.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;

/**
 * 商品管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface PmsProductDao {

    /**
     * 獲取商品編輯訊息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
