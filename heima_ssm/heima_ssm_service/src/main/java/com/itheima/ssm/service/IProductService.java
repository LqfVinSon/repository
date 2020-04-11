package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * @auther VinSon
 * @date 2020/3/2 21:40
 */
//业务层接口
public interface IProductService {
    //查询所有的产品信息
    List<Product> findAll() throws Exception;

    void save(Product product)throws Exception;
}
