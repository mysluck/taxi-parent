package com.jhhs.taxi.passenger.controller;

import com.jhhs.taxi.common.dto.ResponseResult;
import com.jhhs.taxi.common.dto.ShortMsgRequest;
import com.jhhs.taxi.passenger.service.ShortMsgService;
import com.jhhs.taxi.passenger.service.VerificationCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Auther: zhouzy
 * @Date: 2021/1/18 19:41
 * @Description
 */
@RestController
@RequestMapping("/sms")
@Slf4j
public class SmsController {

    @Autowired
    VerificationCodeService verificationCodeService;
    @Autowired
    ShortMsgService shortMsgService;

    @PostMapping("/verify-code/send")
    public ResponseResult verifyCodeSend(@RequestBody @Validated ShortMsgRequest shortMsgRequest) {
        String phoneNumber = shortMsgRequest.getPhoneNumber();
        //验证码
        String code = verificationCodeService.getCode(phoneNumber);
        if (StringUtils.isEmpty(code)) {
            return ResponseResult.fail();
        }
        ResponseResult send = shortMsgService.send(phoneNumber, code);
        int responseCode = send.getCode();
        if (1 == responseCode) {
            return ResponseResult.success(send);
        }
        return ResponseResult.fail(send);
    }

}
