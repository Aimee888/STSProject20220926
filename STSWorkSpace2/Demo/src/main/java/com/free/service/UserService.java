package com.free.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.free.entity.User;

public interface UserService {

    User login(String name,String password);
}