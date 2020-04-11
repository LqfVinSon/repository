package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;

import java.util.List;

/**
 * @auther VinSon
 * @date 2020/3/6 23:16
 */
public interface IRoleService {
    List<Role> findAll() throws  Exception;

    void save(Role role) throws Exception;

    List<Role> findotherRole(String userId) throws Exception;

    Role findById(String roleid) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
