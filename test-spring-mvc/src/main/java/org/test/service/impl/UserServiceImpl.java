package org.test.service.impl;

import org.test.bean.User;
import org.test.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void delete(String name) {
        System.out.println("delete :" + name);
    }

    @Override
    public void add(User user) {
        System.out.println(" add User : " + user);
    }
}
