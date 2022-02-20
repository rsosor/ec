package com.rsosor.ec.service.impl;

import com.github.pagehelper.PageHelper;
import com.rsosor.ec.mapper.SmsCouponHistoryMapper;
import com.rsosor.ec.model.SmsCouponHistory;
import com.rsosor.ec.model.SmsCouponHistoryExample;
import com.rsosor.ec.service.SmsCouponHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 優惠券領取記錄管理 Service Impl
 *
 * @author RsosoR
 * @date 2022/2/21
 */
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {

    @Autowired
    private SmsCouponHistoryMapper historyMapper;

    @Override
    public List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsCouponHistoryExample example = new SmsCouponHistoryExample();
        SmsCouponHistoryExample.Criteria criteria = example.createCriteria();
        if (couponId != null) {
            criteria.andCouponIdEqualTo(couponId);
        }
        if (useStatus != null) {
            criteria.andUseStatusEqualTo(useStatus);
        }
        if (!StringUtils.isEmpty(orderSn)) {
            criteria.andOrderSnEqualTo(orderSn);
        }
        return historyMapper.selectByExample(example);
    }
}
