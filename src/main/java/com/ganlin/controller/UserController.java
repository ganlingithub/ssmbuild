package com.ganlin.controller;

import com.ganlin.beans.User;
import com.ganlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //controller调service
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    //查询全部user,返回到一个user展示页面
    @RequestMapping("/allUser")
    public String list(Model model){
        List<User> userlist=userService.getUserList();
        model.addAttribute("list",userlist);
        return "allUser";
    }

    //跳转到新增页面
    @RequestMapping("/toAddUser")
    public String toAddUser(){

        return "addUser";
    }

    //添加书籍请求
    @RequestMapping("/addUser")
    public String addUser(User user){
        System.out.println("addUser=>"+user);
        userService.addUser(user);
        return "redirect:/user/allUser";
    }

    //跳转到修改页面
    @RequestMapping("/toModifyUser")
    public String toModifyUser(int id,Model model){
        User user=userService.getUserById(id);
        model.addAttribute("Quser",user);
        return "modifyUser";
    }

    //修改页面
    @RequestMapping("/modifyUser")
    public String modifyUser(User user){
        System.out.println("modifyUser=>"+user);
        userService.modifyUser(user);
        return "redirect:/user/allUser";
    }


    //修改页面
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") int id){
        System.out.println(id);
        userService.deleteUser(id);
        return "redirect:/user/allUser";
    }
    //查询
    @RequestMapping("/query")
    public String query(@RequestParam("queryName") String name,Model model){
        List<User> userlist = userService.queryByName(name);
        if(userlist.size()==0){
            userlist=userService.getUserList();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",userlist);
        return "allUser";
    }
}
