package org.test.service;

import org.test.bean.Role;

import java.util.List;

public interface RoleInterface {
    void save(Role Role);

    void update(Role Role);

    void delete(String RoleId);

    Role findOne(String RoleId);

    List<Role> findAll();

    boolean exists(String RoleId);
}
