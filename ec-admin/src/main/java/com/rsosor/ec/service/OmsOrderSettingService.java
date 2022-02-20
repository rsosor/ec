package com.rsosor.ec.service;

import com.rsosor.ec.model.OmsOrderSetting;

/**
 * 訂單設置管理 Service
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface OmsOrderSettingService {

    /**
     * 獲取指定訂單設置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定訂單設置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
