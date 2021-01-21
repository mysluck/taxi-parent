package com.jhhs.taxi.passenger.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/18 19:50
 * @Description 验证码服务
 */
public interface VerificationCodeService {
    String getCode(String phoneNumber);

    String checkCode(String phoneNumber, String code);
}
