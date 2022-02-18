package com.rsosor.ec.service;

import com.rsosor.ec.dto.UmsAdminParam;
import com.rsosor.ec.dto.UpdateAdminPasswordParam;
import com.rsosor.ec.model.UmsAdmin;
import com.rsosor.ec.model.UmsResource;
import com.rsosor.ec.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 後台用戶管理 Service
 *
 * @author RsosoR
 * @date 2022/2/14
 */
public interface UmsAdminService {

    /**
     * 根據用戶名獲取後台管理員
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 註冊功能
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 登錄功能
     */
    String login(String username, String password);

    /**
     * 刷新 token 的功能
     */
    String refreshToken(String oldToken);

    /**
     * 根據用戶 id 獲取用戶
     */
    UmsAdmin getItem(Long id);

    /**
     * 根據用戶名或暱稱分頁查詢用戶
     */
    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用戶訊息
     */
    int update(Long id, UmsAdmin admin);

    /**
     * 刪除指定用戶
     */
    int delete(Long id);

    /**
     * 修改用戶角色關係
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * 獲取用戶對應角色
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 獲取指定用戶的可訪問資源
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 修改密碼
     */
    int updatePassword(UpdateAdminPasswordParam updateAdminPasswordParam);

    /**
     * 獲取用戶訊息
     */
    UserDetails loadUserByUsername(String username);
}
