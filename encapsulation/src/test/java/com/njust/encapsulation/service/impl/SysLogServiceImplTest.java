package com.njust.encapsulation.service.impl;
import java.util.Date;

import com.njust.encapsulation.entity.SysLog;
import com.njust.encapsulation.service.SysLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Chen
 * @version 1.0
 * @date 2020/3/23 0:19
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysLogServiceImplTest {
    @Autowired
    private SysLogService sysLogService;

    @Test
    public void selectByPageCom() {
        SysLog sysLog = new SysLog();
        sysLog.setUserId(90001);
        sysLogService.selectByPageCom(1, sysLog).forEach(System.out::println);


    }
}