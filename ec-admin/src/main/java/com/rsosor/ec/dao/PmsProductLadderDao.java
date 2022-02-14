package com.rsosor.ec.dao;

import com.rsosor.ec.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 會員階梯價格自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface PmsProductLadderDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
