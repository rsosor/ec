package com.rsosor.ec.service;

import com.rsosor.ec.model.UmsAdmin;
import com.rsosor.ec.model.UmsResource;

import java.util.List;

/**
 * 後台用戶緩存操作 Service
 *
 * @author RsosoR
 * @date 2022/2/14
 */
public interface UmsAdminCacheService {

    /**
     * 刪除後台用戶緩存
     */
    void delAdmin(Long adminId);

    /**
     * 刪除後台用戶資源列表緩存
     */
    void delResourceList(Long adminId);

    /**
     * 當角色相關資源訊息改變時刪除相關後台用戶緩存
     */
    void delResourceListByRole(Long roleId);

    /**
     * 當角色相關資源訊息改變時刪除相關後台用戶緩存
     */
    void delResourceListByRoleIds(List<Long> roleIds);

    /**
     * 當資源訊息改變時，刪除資源項目後台用戶緩存
     */
    void delResourceListByResource(Long resourceId);

    /**
     * 獲取緩存後台用戶訊息
     */
    UmsAdmin getAdmin(String username);

    /**
     * 設置緩存後台用戶訊息
     */
    void setAdmin(UmsAdmin admin);

    /**
     * 獲取緩存後台用戶資源列表
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 設置緩存後台用戶資源列表
     */
    void setResourceList(Long adminId, List<UmsResource> resourceList);
}
