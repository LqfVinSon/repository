package com.itheima.ssm.service;

import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @auther VinSon
 * @date 2020/3/3 22:58
 */
public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo)throws Exception;

    UserInfo findById(String id) throws Exception;

    void addRoleToUser(String id,String[] ids) throws Exception;

}
