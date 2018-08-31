package org.test.service.impl;

import org.test.bean.User;
import org.test.service.UserInterface;

import java.util.List;

public class UserServiceImpl implements UserInterface {

    public UserServiceImpl(){
        System.out.println("UserServiceImpl初始化");
        System.out.println(this);
    }

    public void save(User user) {
        System.out.println("save :" + user);
    }

    public void update(User user) {
        System.out.println("update :" + user);

    }

    public void delete(String userId) {
        System.out.println("delete :" + userId);

    }

    public User findOne(String userId) {
        System.out.println("findOne ");
        return null;
    }

    public List<User> findAll() {
        System.out.println("findAll ");

        return null;
    }

    public boolean exists(String userId) {
        System.out.println("exists");
        return false;
    }
}
