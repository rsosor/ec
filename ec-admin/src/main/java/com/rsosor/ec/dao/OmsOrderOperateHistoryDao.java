package com.rsosor.ec.dao;

import com.rsosor.ec.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 訂單操作記錄自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/20
 */
public interface OmsOrderOperateHistoryDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
