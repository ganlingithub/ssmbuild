package com.ganlin.service;

import com.ganlin.beans.User;
import com.ganlin.dao.UserMapper;

import java.util.List;

public class UserServiceImpl implements UserService{
    //业务层调用dao层
    private UserMapper userMapper;

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userMapper=" + userMapper +
                '}';
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int modifyUser(User user) {
        return userMapper.modifyUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public List<User> queryByName(String name) {
        return userMapper.queryByName(name);
    }
}
