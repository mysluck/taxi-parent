package com.jhhs.taxi.serviceverificationcode.controller;

import com.jhhs.taxi.common.dto.ResponseResult;
import com.jhhs.taxi.common.dto.VerifyCodeResponse;
import com.jhhs.taxi.serviceverificationcode.service.VerifyCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/19 9:54
 * @Description
 */

@RestController
@RequestMapping("/verify-code")
@Slf4j
public class VerifyCodeController {
    @Autowired
    VerifyCodeService verifyCodeService;


    /**
     * 根据身份，手机号，生成验证码
     *
     * @param identity
     * @param phoneNumber
     * @return
     */
    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identity") int identity, @PathVariable("phoneNumber") String phoneNumber) {
        return verifyCodeService.generate(identity, phoneNumber);
    }
}
