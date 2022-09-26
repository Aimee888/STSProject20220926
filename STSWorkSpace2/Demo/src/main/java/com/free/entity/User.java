package com.free.entity;

public class User {
    private Integer id;
    private String name;
    private String password;
    
    public Integer getuser_id() {
        return id;
    }
    public void setuser_id(Integer User_id) {
        id = User_id;
    }
    public String getuser_name() {
        return name;
    }
    public void setuser_name(String User_name) {
        name = User_name;
    }

    public String getpassword() {
        return password;
    }
    public void setpassword(String Password) {
        password = Password;
    }

    
    public User(Integer User_id, String User_name,  String Password) {
        super();
        id = User_id;
        name = User_name;
        password = Password;
    }
    
}