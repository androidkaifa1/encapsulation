package com.njust.encapsulation.service.impl;

import com.njust.encapsulation.entity.User;
import com.njust.encapsulation.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Chen
 * @version 1.0
 * @date 2020/3/22 21:38
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void selectByPage() {
        User user = new User();
        user.setUserName("jackchen");

        userService.selectByPage(1, user).forEach(System.out::println);

    }

    @Test
    public void selectByPage2() {
        User user = new User();
        user.setUserName("jackchen");

        userService.selectByPageCom(1, user).forEach(System.out::println);

    }
}