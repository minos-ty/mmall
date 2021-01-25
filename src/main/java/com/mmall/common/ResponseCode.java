package com.mmall.common;

/**
 * 用枚举类来定义常量
 * @author minos
 * @date 2021/1/25 06:49
 */
public enum ResponseCode {

    /**
     * SUCCESS=0
     * ERROR=1
     * NEED_LOGIN=10
     * ILLEGAL_ARGUMENT=2
     */
    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
