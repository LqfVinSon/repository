package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther VinSon
 * @date 2020/3/2 21:46
 */
@Repository
public interface IProductDao {
    //查询所有的产品信息
    @Select("select * from product")
    List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productDesc},#{productStatus})")
    void save(Product product) throws Exception;

    @Select("select * from product where  id=#{id}")
    Product findById(String id) throws Exception;
}
