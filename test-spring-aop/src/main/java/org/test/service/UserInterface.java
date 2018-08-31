package org.test.service;

import org.test.bean.User;

import java.util.List;

public interface UserInterface {
    void save(User user);

    void update(User user);

    void delete(String userId);

    User findOne(String userId);

    List<User> findAll();

    boolean exists(String userId);
}
