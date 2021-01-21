package com.jhhs.taxi.common.dto;

import com.jhhs.taxi.common.constant.CommonStatusEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/19 9:58
 * @Description
 */
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
public class ResponseResult<T> implements Serializable {
    private long respTime;
    private int code;
    private String message;
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(long respTime) {
        this.respTime = respTime;
    }

    public ResponseResult(CommonStatusEnum commonStatusEnum) {
        this(System.currentTimeMillis());
        this.code = commonStatusEnum.code;
        this.message = commonStatusEnum.value;
    }


    public static <T> ResponseResult success(T data) {
        return new ResponseResult(CommonStatusEnum.SUCCESS).setData(data);
    }

    public static <T> ResponseResult fail(T data) {
        return new ResponseResult(CommonStatusEnum.FAIL).setData(data);
    }

    public static <T> ResponseResult fail() {
        return new ResponseResult(CommonStatusEnum.FAIL);
    }

}
