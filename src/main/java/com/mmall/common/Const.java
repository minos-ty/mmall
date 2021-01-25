package com.mmall.common;

/**
 * @author minos
 * @date 2021/1/25 08:28
 */
public class Const {

    public static final String CURRENT_USER = "current_user";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    /**
     * 用内部接口可以实现给常量分组
     */
    public interface Role{
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
