package com.jhhs.taxi.serviceverificationcode.service;

import com.jhhs.taxi.common.dto.ResponseResult;
import com.jhhs.taxi.common.dto.VerifyCodeResponse;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/19 9:55
 * @Description
 */
public interface VerifyCodeService {
    /**
     * 根据身份和手机号生成验证码
     * @param identity
     * @param phoneNumber
     * @return
     */
    public ResponseResult<VerifyCodeResponse> generate(int identity , String phoneNumber);

    /**
     * 校验身份，手机号，验证码的合法性
     * @param identity
     * @param phoneNumber
     * @param code
     * @return
     */
    public ResponseResult verify(int identity, String phoneNumber, String code);}
