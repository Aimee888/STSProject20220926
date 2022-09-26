package com.free.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.free.dao.UserDao;
import com.free.entity.User;

@Service
public class UserServiceImpl implements UserService {
    
    @Resource
    public UserDao userDao;
    
    @Override
    public User login(String name,String password) {
        
        return userDao.login(name,password);
    }

}
