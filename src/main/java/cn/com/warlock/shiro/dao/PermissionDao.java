package cn.com.warlock.shiro.dao;

import cn.com.warlock.shiro.entity.Permission;

public interface PermissionDao {

    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);

}
