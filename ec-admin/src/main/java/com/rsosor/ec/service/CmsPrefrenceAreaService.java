package com.rsosor.ec.service;

import com.rsosor.ec.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 商品優選管理 Service
 *
 * @author RsosoR
 * @date 2022/1/15
 */
public interface CmsPrefrenceAreaService {

    /**
     * 獲取所有優選專區
     */
    List<CmsPrefrenceArea> listAll();
}
