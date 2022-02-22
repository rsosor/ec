package com.rsosor.ec.service;

import com.rsosor.ec.model.UmsResource;

import java.util.List;

/**
 * 後台資源管理 Service
 *
 * @author RsosoR
 * @date 2022/2/22
 */
public interface UmsResourceService {

    /**
     * 添加資源
     */
    int create(UmsResource umsResource);

    /**
     * 修改資源
     */
    int update(Long id, UmsResource umsResource);

    /**
     * 獲取資源詳情
     */
    UmsResource getItem(Long id);

    /**
     * 刪除資源
     */
    int delete(Long id);

    /**
     * 分頁查詢資源
     */
    List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);

    /**
     * 查詢全部資源
     */
    List<UmsResource> listAll();
}
