package com.nxist.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: xym760
 * @Date: 2019/6/4 11:47
 * @Description:
 */
public class BaseService<T> {
    @Autowired
    protected BaseRepository<T> repository;

    public void add() {
        System.out.println("add..............");
        System.out.println(repository);
    }
}
