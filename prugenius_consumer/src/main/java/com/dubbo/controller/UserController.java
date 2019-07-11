package com.dubbo.controller;/**
 * @program: prugenius_consumer
 * @description
 * @author: Jerry Yi
 * @create: 2019-07-09 23:10
 **/

import com.dubbo.entity.User;
import com.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Jerry Yi
 * @date: 2019/7/9 23:10
 * @description:
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping(value = "/sayHello",produces = "application/json;charset=UTF-8")
    public   List<User>  sayHello(){
        List<User> list=userService.sayHello();
        return list;
    }
}
