package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther VinSon
 * @date 2020/3/3 13:58
 */
@Service
public class OrdersServiceImpl implements IOrdersService{

    @Autowired
    private IOrdersDao ordersDao;

    public List<Orders> findAll(Integer page, Integer pageSize) throws Exception {
        //获取第1页，10条内容，默认查询总数count
        PageHelper.startPage(page, pageSize);
        return ordersDao.findAll();
    }

    public Orders findById(String ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}
