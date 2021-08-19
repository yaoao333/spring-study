package com.yao.service;

import com.yao.dao.UserDao;
import com.yao.dao.UserDaoImpl_1;

public class UserServiceImpl implements UserService{
//    由于业务层需要访问dao层以获取数据

//    private UserDao userDao=new UserDaoImpl_1();传统方式，选择权在业务层，耦合性强

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {  //ioc控制反转思想，将选择权交给用户，能切换不同的UserDao实现
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
