package com.rsosor.ec.service.impl;

import com.rsosor.ec.mapper.UmsMemberLevelMapper;
import com.rsosor.ec.model.UmsMemberLevel;
import com.rsosor.ec.model.UmsMemberLevelExample;
import com.rsosor.ec.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 會員等級管理 Service Impl
 *
 * @author RsosoR
 * @date 2022/2/19
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {

    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;

    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
