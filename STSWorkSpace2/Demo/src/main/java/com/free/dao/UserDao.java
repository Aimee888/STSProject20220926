package com.free.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.free.entity.User;

public interface UserDao {

    User login(@Param("name") String name,@Param("password") String password); //这个地方的name和Usermapper里面login中select语句#{name}对应
}
