package com.lutingting.springcloud.user.service.impl;


import com.lutingting.springcloud.user.pojo.User;
import com.lutingting.springcloud.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("123456");
        return user;
    }
}
