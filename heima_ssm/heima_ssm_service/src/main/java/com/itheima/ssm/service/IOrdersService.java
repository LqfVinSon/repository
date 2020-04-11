package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

/**
 * @auther VinSon
 * @date 2020/3/3 13:57
 */
public interface IOrdersService {
    List<Orders> findAll(Integer page, Integer pageSize) throws Exception;

    Orders findById(String ordersId) throws  Exception;
}
