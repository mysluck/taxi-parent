package com.jhhs.taxi.common.constant;

import lombok.Getter;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/19 10:01
 * @Description
 */
public enum CommonStatusEnum {
    /**
     * 操作成功
     */
    SUCCESS(1, "success"),
    /**
     * 操作失败
     */
    FAIL(0, "fail"),
    /**
     * 操作异常
     */
    INTERNAL_SERVER_EXPERTION(0, "exception");

    public int code;
    public String value;

    CommonStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

}
