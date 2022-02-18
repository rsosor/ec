package com.rsosor.ec.dao;

import com.rsosor.ec.model.UmsAdminRoleRelation;
import com.rsosor.ec.model.UmsResource;
import com.rsosor.ec.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 後台用戶與角色關係管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/14
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 批量插入用戶角色關係
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 獲取用戶所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 獲取用戶所有可訪問資源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 獲取資源相關用戶 ID 列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
