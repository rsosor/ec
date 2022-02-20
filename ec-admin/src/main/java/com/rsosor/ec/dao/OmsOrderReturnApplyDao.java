package com.rsosor.ec.dao;

import com.rsosor.ec.dto.OmsOrderReturnApplyResult;
import com.rsosor.ec.dto.OmsReturnApplyQueryParam;
import com.rsosor.ec.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 訂單退貨申請自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/20
 */
public interface OmsOrderReturnApplyDao {

    /**
     * 查詢申請列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 獲取申請詳情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id") Long id);
}
