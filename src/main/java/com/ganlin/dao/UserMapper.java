package com.ganlin.dao;

import com.ganlin.beans.User;

import java.util.List;

public interface UserMapper {
    //增加一个用户
    int addUser(User user);
    //删除一个用户
    int deleteUser(int id);
    //更新一个用户
    int modifyUser(User user);
    //查询一个用户
    User getUserById(int id);
    //查询全部的用户
    List<User> getUserList();
    //查询by name
    List<User> queryByName(String name);
}
