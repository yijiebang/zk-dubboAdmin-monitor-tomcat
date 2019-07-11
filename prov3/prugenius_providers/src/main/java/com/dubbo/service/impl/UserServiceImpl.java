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
       System.out.println("---------------------------------服务1：9001，dubbo:20880---------------------------------");
        return userDao.sayHello();
    }
}
