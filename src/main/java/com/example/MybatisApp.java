package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example"})
@EntityScan("com.example.entity")
@MapperScan(basePackages = {"com.example.test01.mapper","com.example.test02.mapper"})
//@EnableAutoConfiguration
public class MybatisApp {
    public static void main(String[] args){
        SpringApplication.run(MybatisApp.class);
    }
}
