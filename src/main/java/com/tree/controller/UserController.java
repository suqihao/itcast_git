package com.tree.controller;

import com.tree.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: suqihao
 * @description: itheima
 * @date: 2019/2/24 21:08
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    @ResponseBody
    public User list(){
        User user = new User();
        for (int i = 0; i < 5; i++) {
            user.setId(i);
            user.setUsername("张三="+i);
            user.setPassword("admin="+i);
            user.setAge(20+i);
            user.setEmail("1070694470@16"+(2+i)+".com");
            user.setAge(50+i);
        }
        return user;
    }

}
