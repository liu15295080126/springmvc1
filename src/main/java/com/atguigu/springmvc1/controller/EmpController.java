package com.atguigu.springmvc1.controller;

import com.atguigu.springmvc1.entity.User;
import com.atguigu.springmvc1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Collection;

/**
 * @author chengLiu
 * @createTime 2019-05-21 21:37
 */
@Controller
public class EmpController {
    @Autowired
    UserService userService;
    //查询所有员工，返回列表页面
    @GetMapping("/emps")
    public String list(Model model){
        Collection<User> users=userService.listAll();
        model.addAttribute("emps",users);
        return "emp/list";
    }
}
