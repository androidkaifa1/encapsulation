package com.njust.encapsulation.service.impl;

import com.github.pagehelper.PageHelper;
import com.mysql.jdbc.StringUtils;
import com.njust.encapsulation.entity.User;
import com.njust.encapsulation.mapper.UserMapper;
import com.njust.encapsulation.service.UserService;
import com.njust.encapsulation.usual.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author Chen
 * @version 1.0
 * @date 2020/3/22 21:28
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 根据名称模糊分页查询。
     * @param page
     * @param user
     * @return
     */
    @Override
    public List<User> selectByPage(Integer page, User user) {
        PageHelper.startPage(page, 5);
        // 告诉系统查询那个类
        Example example = new Example(user.getClass());
        // 创建查询
        Example.Criteria criteria = example.createCriteria();
        // 模糊查询的判断
        if (!StringUtils.isEmptyOrWhitespaceOnly(user.getUserName())) {
            criteria.andLike("userName", "%" + user.getUserName() + "%");
        }
        example.orderBy("password").desc();
        return userMapper.selectByExample(example);
    }

    @Override
    public List<User> selectByPageCom(Integer page, User user) {
        List<User> users = Share.selectByPage(page, user, userMapper);
        return users;
    }
}
