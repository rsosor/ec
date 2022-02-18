package com.rsosor.ec.dao;

import com.rsosor.ec.model.UmsMenu;
import com.rsosor.ec.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 後台角色管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/16
 */
public interface UmsRoleDao {

    /**
     * 根據後台用戶 ID 獲取菜單
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);

    /**
     * 根據角色 ID 獲取菜單
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    /**
     * 根據角色 ID 獲取資源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
