package com.example.car.controller.client;

import com.example.car.model.User;
import com.example.car.service.cilent.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 描述：
 *
 * @author menxipeng by 2022/10/14
 */
@RestController
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Map<String,Object> register(@RequestBody User user){
        userService.register(user);
        return null;
    }

}
