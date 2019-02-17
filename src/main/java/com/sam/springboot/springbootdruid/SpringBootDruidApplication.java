package com.sam.springboot.springbootdruid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.sam.springboot.springbootdruid.Mapper")
@SpringBootApplication
public class SpringBootDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDruidApplication.class, args);
    }

}

