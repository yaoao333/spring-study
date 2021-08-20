package com.yao.dao;

import com.yao.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    List<User> findAll();
}
