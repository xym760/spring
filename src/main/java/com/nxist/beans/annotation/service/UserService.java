package com.nxist.beans.annotation.service;

import com.nxist.beans.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author: xym760
 * @Date: 2019/6/3 16:17
 * @Description:
 */
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    //在有多高实现类时，通过Qualifier注解指定具体使用哪一个实现类
    public void setUserRepository(@Qualifier("userRepositoryImpl") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add() {
        System.out.println("UserService add....");
        userRepository.save();
    }
}
