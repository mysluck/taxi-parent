package com.jhhs.taxi.passenger.service;

import com.jhhs.taxi.common.dto.ResponseResult;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/20 15:19
 * @Description
 */
public interface ShortMsgService {
    /**
     * 发送验证码
     *
     * @param phonenumber
     * @param code
     * @return
     */
    ResponseResult send(String phonenumber, String code);


}
