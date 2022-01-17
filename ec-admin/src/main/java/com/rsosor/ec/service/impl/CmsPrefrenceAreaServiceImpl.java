package com.rsosor.ec.service.impl;

import com.rsosor.ec.mapper.CmsPrefrenceAreaMapper;
import com.rsosor.ec.model.CmsPrefrenceArea;
import com.rsosor.ec.model.CmsPrefrenceAreaExample;
import com.rsosor.ec.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品優選管理 Service Impl
 *
 * @author RsosoR
 * @date 2022/1/17
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {

    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
