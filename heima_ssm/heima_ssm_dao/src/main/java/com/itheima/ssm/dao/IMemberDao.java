package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @auther VinSon
 * @date 2020/3/3 16:03
 */
@Repository
public interface IMemberDao {
    @Select("select * from member where id=#{memberId}")
    Member findById(String memberId) throws Exception;
}
