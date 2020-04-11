package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @auther VinSon
 * @date 2020/3/3 16:08
 */
@Repository
public interface ITravellersDao {
    @Select("select * from member where id in(select travellerId from order_traveller where orderId=#{ordersId})")
    Traveller findByOrdersId(String ordersId) throws Exception;
}
