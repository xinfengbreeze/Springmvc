package com.sport.controller;
import com.sport.model.UserImpl;
import com.sport.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * User: kaifeng.yuan
 * Date: 2/22/17.
 */
@Controller
@RequestMapping("/account")
public class AccountManager {
//jsp 页面可以放在 WEB-INF中也可以放在外面
//    放在WEB-INF中的jsp不能够被外界直接访问 只能通过 controller 通过程序进行跳转（以保证安全，是通过认证采访问到的）
    @Autowired
    UserMapper userMapper;

    @RequestMapping("login")
    public String login(UserImpl user, Model model){
        user.setName(user.getName()+"---已认证");
        model.addAttribute("user",user);
        return "userinfo";
    }
    @RequestMapping("register")
    public String register(UserImpl user,Model model){
        System.out.print(user.toString());
        userMapper.add(user);
        user.setName(user.getName()+"---已注册");
        model.addAttribute("user",user);
        return "userinfo";
    }
    @RequestMapping("changePassword")
    public String changePassword(UserImpl user,String oldPassword,String newPassword,Model model){
        user.setName(user.getName()+"---已修改密码");
        user.setPassword(oldPassword);
        model.addAttribute("user",user);
        return "userinfo";
    }

    @RequestMapping("registerPage")
    public String goToRegister(){
        return "register";
    }

}
