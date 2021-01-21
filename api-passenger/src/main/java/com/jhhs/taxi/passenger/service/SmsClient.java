package com.jhhs.taxi.passenger.service;

import com.jhhs.taxi.common.dto.ResponseResult;
import com.jhhs.taxi.common.dto.sms.SmsSendRequest;
import com.jhhs.taxi.passenger.fallback.SmsClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/20 15:23
 * @Description
 */
//@FeignClient(name = "service-sms",fallback = SmsClientFallback.class)
@FeignClient(name = "service-sms")
public interface SmsClient {
    /**
     * 按照短信模板发送验证码
     * @param smsSendRequest
     * @return
     */
    @RequestMapping(value="/send/alisms-template", method = RequestMethod.POST)
    public ResponseResult sendSms(@RequestBody SmsSendRequest smsSendRequest) throws Exception;
}
