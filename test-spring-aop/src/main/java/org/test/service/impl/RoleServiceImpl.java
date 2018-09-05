package org.test.service.impl;

import org.test.bean.Role;
import org.test.service.RoleInterface;

import java.util.List;

public class RoleServiceImpl implements RoleInterface {

    public RoleServiceImpl(){
        System.out.println("RoleServiceImpl初始化");
        System.out.println(this);
    }

    public void save(Role Role) {
        System.out.println("save :" + Role);
    }

    public void update(Role Role) {
        System.out.println("update :" + Role);

    }

    public static String sayHello(String name){
        System.out.println("hello");
        return "hell : " + name;
    }

    public void delete(String RoleId) {
        System.out.println("delete :" + RoleId);

    }

    public Role findOne(String RoleId) {
        System.out.println("findOne ");
        return null;
    }

    public List<Role> findAll() {
        System.out.println("findAll ");

        return null;
    }

    public boolean exists(String RoleId) {
        System.out.println("exists");
        return false;
    }
}
