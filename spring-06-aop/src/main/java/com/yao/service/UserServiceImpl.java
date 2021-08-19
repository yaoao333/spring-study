package com.yao.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("执行add操作");
    }

    @Override
    public void delete() {
        System.out.println("执行delete操作");
    }

    @Override
    public void update() {
        System.out.println("执行update操作");
    }

    @Override
    public void search() {
        System.out.println("执行search操作");
    }
}
