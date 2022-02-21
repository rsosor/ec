package com.rsosor.ec.service;

import com.rsosor.ec.model.SmsHomeAdvertise;

import java.util.List;

/**
 * 首頁廣告管理 Service
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface SmeHomeAdvertiseService {

    /**
     * 添加廣告
     */
    int create(SmsHomeAdvertise advertise);

    /**
     * 批量刪除廣告
     */
    int delete(List<Long> ids);

    /**
     * 修改上、下線狀態
     */
    int updateStatus(Long id, Integer status);

    /**
     * 獲取廣告詳情
     */
    SmsHomeAdvertise getItem(Long id);

    /**
     * 更新廣告
     */
    int update(Long id, SmsHomeAdvertise advertise);

    /**
     * 分頁查詢廣告
     */
    List<SmsHomeAdvertise> list(String name, Integer type, String endTime, Integer pageSize, Integer pageNum);
}
