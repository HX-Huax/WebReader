package com.bluestar.WebReader.controller;

import com.bluestar.WebReader.domain.User;
import com.bluestar.WebReader.service.UserService;
import com.bluestar.WebReader.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public Result<User> loginController(@RequestParam String uname, @RequestParam String password){
        User user = userService.loginService(uname, password);
        if(user != null){
            return Result.success(user,"登录成功");
        }else{
            return Result.error("100","登录失败");
        }
    }
    @PostMapping("/register")
    public Result<User> registController(@RequestBody User newUser){
        User user = userService.registService(newUser);
        if(user!=null){
            return Result.success(user,"注册成功！");
        }else{
            return Result.error("100","用户名已存在！");
        }
    }

}
