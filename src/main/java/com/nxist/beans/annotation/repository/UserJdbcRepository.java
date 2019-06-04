package com.nxist.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @Author: xym760
 * @Date: 2019/6/4 10:50
 * @Description:
 */
@Repository
public class UserJdbcRepository implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save...........");
    }
}
