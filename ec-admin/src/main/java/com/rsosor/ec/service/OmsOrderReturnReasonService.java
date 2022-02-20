package com.rsosor.ec.service;

import com.rsosor.ec.model.OmsOrderReturnReason;

import java.util.List;

/**
 * 退貨原因管理 Service
 *
 * @author RsosoR
 * @date 2022/2/20
 */
public interface OmsOrderReturnReasonService {

    /**
     * 添加退貨原因
     */
    int create(OmsOrderReturnReason returnReason);

    /**
     * 修改退貨原因
     */
    int update(Long id, OmsOrderReturnReason returnReason);

    /**
     * 批量刪除退貨原因
     */
    int delete(List<Long> ids);

    /**
     * 分頁獲取退貨原因
     */
    List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);

    /**
     * 批量修改退貨原因狀態
     */
    int updateStatus(List<Long> ids, Integer status);

    /**
     * 獲取單個退貨原因詳情訊息
     */
    OmsOrderReturnReason getItem(Long id);
}
