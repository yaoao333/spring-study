package com.yao.dao.Impl;

import com.yao.dao.UserDao;
import com.yao.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll() throws IOException {
        //关联核心配置文件
        InputStream resourceAsStream= Resources.getResourceAsStream("SqlMapConfig.xml");
        //获取session会话对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //关联sql语句并执行，返回结果自动封装成对象，要封装的对象类型在sql语句所在的mapper文件中配置，sql语句所在的mapper文件已被关联进核心配置文件中
        return sqlSession.selectList("userMapper.findAll");
    }
}
