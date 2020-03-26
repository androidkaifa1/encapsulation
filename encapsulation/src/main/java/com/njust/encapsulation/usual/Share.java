package com.njust.encapsulation.usual;

import com.github.pagehelper.PageHelper;
import com.njust.encapsulation.utils.IBaseMapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author Chen
 * @version 1.0
 * @date 2020/3/22 20:09
 * @description:
 */
public class Share {

    public static final Integer DEFAULT_PAGE_SIZE = 10;

    public static <T> List<T> selectByPage(Integer page, T t, IBaseMapper<T> baseMapper) {
        PageHelper.startPage(page, DEFAULT_PAGE_SIZE);
        // 告诉系统查询那个类
        Example example = new Example(t.getClass());
        // 创建查询
        Example.Criteria criteria = example.createCriteria();

        criteria.andEqualTo(t);

        return baseMapper.selectByExample(example);
    }
}
