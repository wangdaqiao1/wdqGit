package com.wdq.controller;

import com.wdq.model.User;
import com.wdq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   kinbridge
 * Date:     2018/7/29 16:54
 * Description: java
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 获取所有用户列表
     *
     * @param request
     * @return
     */
    @RequestMapping("/getAllUser")
    public String getAllUser(HttpServletRequest request, Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("userList", user);
        request.setAttribute("userList", user);
        return "/allUser";
    }

    /**
     * 跳转到添加用户界面
     *
     * @return
     */
    @RequestMapping("/toAddUser")
    public String toAddUser() {
        return "/addUser";
    }

    /**
     * 添加用户并重定向
     *
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(User user, Model model) {
        userService.save(user);
        return "redirect:/user/getAllUser";
    }

    /**
     * 编辑用户
     *
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(User user, HttpServletRequest request, Model model) {
        if (userService.update(user)) {
            user = userService.findById(user.getId());
            request.setAttribute("user", user);
            model.addAttribute("user", user);
            return "redirect:/user/getAllUser";
        } else {
            return "/error";
        }
    }

    /**
     * 根据id查询单个用户
     *
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/getUser")
    public String getUser(int id, HttpServletRequest request, Model model) {
        request.setAttribute("user", userService.findById(id));
        model.addAttribute("user", userService.findById(id));
        return "/editUser";
    }

    /**
     * 删除用户
     *
     * @param id
     * @param request
     * @param response
     */
    @RequestMapping("/delUser")
    public void delUser(int id, HttpServletRequest request, HttpServletResponse response) {
        String result = "{\"result\":\"error\"}";
        if (userService.delete(id)) {
            result = "{\"result\":\"success\"}";
        }
        response.setContentType("application/json");
        try {
            PrintWriter out = response.getWriter();
            out.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
