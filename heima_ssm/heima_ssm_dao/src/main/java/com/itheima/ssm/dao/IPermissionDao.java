package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther VinSon
 * @date 2020/3/6 23:04
 */
@Repository
public interface IPermissionDao {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{roleId})")
    public List<Permission> findByRoleId(String roleId)throws Exception;

    @Select("select * from permission")
    List<Permission> findAll()throws Exception;

    @Insert("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission)throws Exception;

    @Select("select * from permission where id not in (select permissionId from role_permission where roleid=#{roleid})")
    List<Permission> findOtherPermission(String roleid)throws Exception;
}
