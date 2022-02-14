package com.rsosor.ec.dao;

import com.rsosor.ec.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品審核日誌管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface PmsProductVertifyRecordDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> productVertifyRecordList);
}
