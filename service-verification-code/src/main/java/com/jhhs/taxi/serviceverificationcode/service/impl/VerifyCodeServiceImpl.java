package com.jhhs.taxi.serviceverificationcode.service.impl;

import com.jhhs.taxi.common.dto.ResponseResult;
import com.jhhs.taxi.common.dto.VerifyCodeResponse;
import com.jhhs.taxi.common.util.RedisKeyUtil;
import com.jhhs.taxi.serviceverificationcode.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/19 10:42
 * @Description
 */
@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 生成验证码
     *
     * @param identity
     * @param phoneNumber
     * @return
     */
    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        String code = String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)));
        //生成redis key
        String keyPre = RedisKeyUtil.generateKeyPreByIdentity(identity);
        String key = keyPre + phoneNumber;
        //返回
        BoundValueOperations<String, String> codeRedis =redisTemplate.boundValueOps(key);
        codeRedis.set(code,120, TimeUnit.SECONDS);

        VerifyCodeResponse result = new VerifyCodeResponse();
        result.setCode(code);
        return ResponseResult.success(result);
    }

    @Override
    public ResponseResult verify(int identity, String phoneNumber, String code) {
        return null;
    }
}
