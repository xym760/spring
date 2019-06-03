package com.nxist.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @Author: xym760
 * @Date: 2019/6/3 16:15
 * @Description:
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository Save.....");
    }
}
