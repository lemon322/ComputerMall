package com.lcc.store.mapper;

import com.lcc.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("user01");
        user.setPassword("123456");
        Integer rows = userMapper.insert(user);
        System.out.println("rows=" + rows);
    }

    @Test
    public void findByUsername() {
        String username = "user01";
        User result = userMapper.findByUsername(username);
        System.out.println(result);
    }

    @Test
    public void findByUserId(){
        Integer id=2;
        User result=userMapper.selectUserById(id);
        System.out.println(result.toString());
    }

    @Test
    public void updatePasswordById(){
        Integer id=4;
        String password="123";
        String modifiedUser="管理员";
        Date modifiedTime=new Date();
        userMapper.updatePasswordById(id,password,modifiedUser,modifiedTime);
    }

    @Test
    public void updateInfoByUid() {
        User user = new User();
        user.setUid(4);
        user.setPhone("17858802222");
        user.setEmail("admin@cy.com");
        user.setGender(1);
        user.setModifiedUser("系统管理员");
        user.setModifiedTime(new Date());
        Integer rows = userMapper.updateInfoByUid(user);
        System.out.println("rows=" + rows);
    }

    @Test
    public void updateAvatarByUid() {
        Integer uid = 4;
        String avatar = "/upload/avatar.png";
        String modifiedUser = "超级管理员";
        Date modifiedTime = new Date();
        Integer rows = userMapper.updateAvatarByUid(uid, avatar, modifiedUser, modifiedTime);
        System.out.println("rows=" + rows);
    }

}
