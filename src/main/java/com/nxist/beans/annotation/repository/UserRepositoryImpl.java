package com.nxist.beans.annotation.repository;

import com.nxist.beans.annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author: xym760
 * @Date: 2019/6/3 16:15
 * @Description:
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    //required=false表示该bean在容器中可以不存在，既可以为空
    @Autowired(required = false)
    TestObject testObject;
    @Override
    public void save() {
        System.out.println("UserRepository Save.....");
        System.out.println(testObject);
    }
}
