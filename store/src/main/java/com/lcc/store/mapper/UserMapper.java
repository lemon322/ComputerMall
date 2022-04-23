package com.lcc.store.mapper;

import com.lcc.store.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface UserMapper {
    /**
     * 插入用户数据
     * @param user 用户数据
     * @return 受影响的行数
     */
    Integer insert(User user);

    /**
     * 根据用户名查询用户数据
     * @param username 用户名
     * @return 匹配的用户数据，如果没有匹配的数据，则返回null
     */
    User findByUsername(String username);

    /**
     * 根据用户id修改密码
     * @param id
     * @param password 新密码
     * @param modifiedUser
     * @param modifiedTime 修改时间
     * @return
     */
    Integer updatePasswordById(Integer id, String password, String modifiedUser, Date modifiedTime);

    User selectUserById(Integer id);

    Integer updateInfoByUid(User user);

    Integer updateAvatarByUid(
            @Param("uid") Integer uid,
            @Param("avatar") String avatar,
            @Param("modifiedUser") String modifiedUser,
            @Param("modifiedTime") Date modifiedTime);
}
