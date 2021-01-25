package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author ty
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 校验用户名是否已经存在
     * @param username
     * @return
     */
    int checkUsername(String username);

    /**
     * 校验邮箱是否存在
     * @param email
     * @return
     */
    int checkEmail(String email);

    /**
     * 用户登录
     * mybatis在传递多个参数时要用 @Param("username")  写sql时要对应param里的参数
     * @param username
     * @param password
     * @return
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 通过用户名查找 找回密码的问题
     * @param username
     * @return
     */
    String selectQuestionByUsername(String username);

    /**
     * 验证找回密码的问题回答是否正确
     * @param username
     * @param question
     * @param answer
     * @return
     */
    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    /**
     * 更新密码
     * @param username
     * @param passwordNew
     * @return
     */
    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    /**
     * 登录状态下修改密码 校验旧密码
     * @param password
     * @param userId
     * @return
     */
    int checkPassword(@Param(value = "password") String password, @Param("userId") Integer userId);

    /**
     * 校验邮箱是否已经存在
     * @param email
     * @param userId
     * @return
     */
    int checkEmailByUserId(@Param(value = "email") String email, @Param(value = "userId") Integer userId);
}