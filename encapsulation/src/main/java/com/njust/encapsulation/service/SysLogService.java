package com.njust.encapsulation.service;

import com.njust.encapsulation.entity.SysLog;
import com.njust.encapsulation.entity.User;

import java.util.List;

/**
 * @author Chen
 * @version 1.0
 * @date 2020/3/22 21:28
 * @description:
 */
public interface SysLogService {

    List<SysLog> selectByPageCom(Integer page, SysLog sysLog);
}
