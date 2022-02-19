package com.rsosor.ec.service;

import com.rsosor.ec.model.UmsMenu;
import com.rsosor.ec.model.UmsResource;
import com.rsosor.ec.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 後台用戶角色管理 Service
 *
 * @author RsosoR
 * @date 2022/2/14
 */
public interface UmsRoleService {

    /**
     * 添加角色
     */
    int create(UmsRole role);

    /**
     * 修改角色訊息
     */
    int update(Long id, UmsRole role);

    /**
     * 批量刪除角色
     */
    int delete(List<Long> ids);

    /**
     * 獲取所有角色列表
     */
    List<UmsRole> list();

    /**
     * 分頁獲取角色列表
     */
    List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 根據管理員 ID 獲取對應菜單
     */
    List<UmsMenu> getMenuList(Long adminId);

    /**
     * 獲取角色相關菜單
     */
    List<UmsMenu> listMenu(Long roleId);

    /**
     * 獲取角色相關資源
     */
    List<UmsResource> listResource(Long roleId);

    /**
     * 給角色分配菜單
     */
    @Transactional
    int allocMenu(Long roleId, List<Long> menuIds);

    /**
     * 給角色分配資源
     */
    @Transactional
    int allocResource(Long roleId, List<Long> resourceIds);
}
