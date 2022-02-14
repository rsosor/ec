package com.rsosor.ec.dao;

import com.rsosor.ec.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 會員價格管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface PmsMemberPriceDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
