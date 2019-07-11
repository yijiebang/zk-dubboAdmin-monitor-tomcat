package com.dubbo.dao;/**
 * @program: prugeniusagent
 * @description
 * @author: Jerry Yi
 * @create: 2019-07-09 22:50
 **/

import com.dubbo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: Jerry Yi
 * @date: 2019/7/9 22:50
 * @description:
 */
@Mapper
public interface UserDao {
    @Select("select * from user")
    List<User>  sayHello();
}
