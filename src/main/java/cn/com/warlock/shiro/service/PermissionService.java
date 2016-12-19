package cn.com.warlock.shiro.service;

import cn.com.warlock.shiro.entity.Permission;

public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
