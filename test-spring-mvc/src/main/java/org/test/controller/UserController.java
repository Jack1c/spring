package org.test.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.test.bean.User;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {

    public UserController(){
        System.out.println("UserController init ");
    }

    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public ModelAndView defaultIndex(ModelMap modelMap, HttpServletRequest request) {
        List<User> Users = new ArrayList<User>();
        User UserA = new User();
        User UserB = new User();

        UserA.setName("zhang");
        UserA.setAge(27);
        UserB.setName("li");
        UserB.setAge(35);

        Users.add(UserA);
        Users.add(UserB);
        modelMap.addAttribute("users", Users);

        ModelAndView modelAndView = new ModelAndView("index");


        System.out.println("文件的绝对路径" + request.getSession().getServletContext().getRealPath(request.getRequestURI()));

        return modelAndView;
    }

    @RequestMapping("/listUser.do")
    @ResponseBody
    public List<Object> listUser() {
        User user = new User("jack", 20);

        ArrayList<Object> list = new ArrayList<>();
        list.add(user);
        return list;
    }


}
