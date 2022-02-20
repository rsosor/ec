package com.rsosor.ec.service;

import com.rsosor.ec.dto.OmsOrderReturnApplyResult;
import com.rsosor.ec.dto.OmsReturnApplyQueryParam;
import com.rsosor.ec.dto.OmsUpdateStatusParam;
import com.rsosor.ec.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退貨申請管理 Service
 *
 * @author RsosoR
 * @date 2022/2/20
 */
public interface OmsOrderReturnApplyService {

    /**
     * 分頁查詢申請
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量刪除申請
     */
    int delete(List<Long> ids);

    /**
     * 修改指定申請狀態
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 獲取指定申請詳情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
