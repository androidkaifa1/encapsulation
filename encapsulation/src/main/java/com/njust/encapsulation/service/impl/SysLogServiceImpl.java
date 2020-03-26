package com.njust.encapsulation.service.impl;

import com.njust.encapsulation.entity.SysLog;
import com.njust.encapsulation.mapper.SysLogMapper;
import com.njust.encapsulation.service.SysLogService;
import com.njust.encapsulation.usual.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chen
 * @version 1.0
 * @date 2020/3/23 0:17
 * @description:
 */
@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public List<SysLog> selectByPageCom(Integer page, SysLog sysLog) {
        return Share.selectByPage(page, sysLog, sysLogMapper);
    }
}
