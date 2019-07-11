package com.dubbo.service.impl;

import com.dubbo.dao.UserDao;
import com.dubbo.entity.User;
import com.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements  UserService{
    @Autowired
    UserDao userDao;


    @Override
    public List<User> sayHello() {
       System.out.println("---------------------------------服务2：9002，dubbo:20881---------------------------------");
        return userDao.sayHello();
    }
}
