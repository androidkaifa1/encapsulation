package com.njust.encapsulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.njust.encapsulation.mapper")
public class EncapsulationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncapsulationApplication.class, args);
    }

}
