package com.rsosor.ec.service.impl;

import com.rsosor.ec.mapper.OmsOrderSettingMapper;
import com.rsosor.ec.model.OmsOrderSetting;
import com.rsosor.ec.service.OmsOrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 訂單設置管理 Service Impl
 *
 * @author RsosoR
 * @date 2022/2/21
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {

    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
