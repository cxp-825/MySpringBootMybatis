package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

//用户数据业务操作接口
public interface UserService {

    //获取全部用户数据
    public List<User> getUserList();

    //新增用户数据
    public void createUser(User user);

    //获取指定id用户的信息
    public User getUser(Long id);

    //更新指定id用户信息
    public void updateUser(Long id, User user);

    //删除指定id用户信息
    public void deleteUser(Long id);
}