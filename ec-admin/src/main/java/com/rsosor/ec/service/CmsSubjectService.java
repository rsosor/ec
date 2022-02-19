package com.rsosor.ec.service;

import com.rsosor.ec.model.CmsSubject;

import java.util.List;

/**
 * 商品專題管理 Service
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public interface CmsSubjectService {

    /**
     * 查詢所有專題
     */
    List<CmsSubject> listAll();

    /**
     * 分頁查詢專題
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
