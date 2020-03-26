package com.njust.encapsulation.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Chen
 * @version 1.0
 * @date 2020/3/22 9:12
 * @description:
 */
public interface IBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}