package com.rsosor.ec.service;

import com.rsosor.ec.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收貨地址管理 Service
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public interface OmsCompanyAddressService {

    /**
     * 獲取全部收貨地址
     */
    List<OmsCompanyAddress> list();
}
