package com.example.service;


import com.example.entity.User;
import com.example.test01.mapper.UserMapperTest01;
import com.example.test02.mapper.UserMapperTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapperTest01 userMapperTest01;

    @Autowired
    private UserMapperTest02 userMapperTest02;

    public User findByName01(String name) {
        return userMapperTest01.findByName(name);
    }

    public User findByName02(String name) {
        return userMapperTest02.findByName(name);
    }


    public int insert01(String name, Integer age) {
        return userMapperTest01.insert(name, age);
    }


    public int insert02(String name, Integer age) {
        return userMapperTest02.insert(name, age);
    }
}
