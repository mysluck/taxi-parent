package com.jhhs.taxi.passenger.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jhhs.taxi.common.constant.IdentityConstant;
import com.jhhs.taxi.common.dto.ResponseResult;
import com.jhhs.taxi.common.dto.VerifyCodeResponse;
import com.jhhs.taxi.passenger.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/18 20:08
 * @Description
 */
@Service
public class VerificationCodeServiceImpl implements VerificationCodeService {

    @Autowired
    RestTemplate restTemplate;
    private final String SERVICE_VERIFICATION_CODE_SERVICE = "service-verification-code";

    @Override
    public String getCode(String phoneNumber) {
        String url = "http://" + SERVICE_VERIFICATION_CODE_SERVICE + "/verify-code/generate/" + IdentityConstant.PASSENGER + "/" + phoneNumber;
        ResponseResult result = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<Object>(null, null), ResponseResult.class).getBody();
        if (1 == result.getCode()) {
            VerifyCodeResponse response = JSONObject.parseObject(JSONObject.toJSONString(result.getData()), VerifyCodeResponse.class);
            return response.getCode();
        }
        return "";
    }

    @Override
    public String checkCode(String phoneNumber, String code) {
        return null;
    }
}
