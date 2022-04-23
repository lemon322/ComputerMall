package com.lcc.store.service;

import com.lcc.store.entity.User;
import org.springframework.stereotype.Service;

/** 处理用户数据的业务层接口 */
public interface IUserService {
    /**
     * 用户注册
     * @param user 用户数据
     */
    void reg(User user);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);

    /**
     * 密码修改
     * @param uid
     * @param username
     * @param oldpassword
     * @param newpassword
     */
   void changePassword(Integer uid,String username,String oldpassword,String newpassword);

    /**
     * 获取当前登录的用户的信息
     * @param uid 当前登录的用户的id
     * @return 当前登录的用户的信息
     */
    User getByUid(Integer uid);

    /**
     * 修改用户资料
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @param user 用户的新的数据
     */
    void changeInfo(Integer uid, String username, User user);

    /**
     * 头像修改
     * @param uid
     * @param username
     * @param avatar
     */
    void changeAvatar(Integer uid, String username, String avatar);
}
