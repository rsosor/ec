package com.rsosor.ec.service;

import com.rsosor.ec.model.UmsMemberLevel;

import java.util.List;

/**
 * 會員等級管理 Service
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public interface UmsMemberLevelService {

    /**
     * 獲取所有會員等級
     * @param defaultStatus 是否為預設會員
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
