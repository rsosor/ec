package com.rsosor.ec.service.impl;

import com.rsosor.ec.mapper.OmsCompanyAddressMapper;
import com.rsosor.ec.model.OmsCompanyAddress;
import com.rsosor.ec.model.OmsCompanyAddressExample;
import com.rsosor.ec.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收貨地址管理 Service Impl
 *
 * @author RsosoR
 * @date 2022/2/19
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {

    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;

    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
