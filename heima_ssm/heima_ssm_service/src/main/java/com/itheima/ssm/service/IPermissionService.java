package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import org.springframework.security.core.parameters.P;

import java.util.List;

/**
 * @auther VinSon
 * @date 2020/3/6 23:42
 */
public interface IPermissionService {
    List<Permission> findAll()throws Exception;
    void save(Permission permission) throws Exception;

    List<Permission> findOtherPermission(String roleid)throws Exception;
}
