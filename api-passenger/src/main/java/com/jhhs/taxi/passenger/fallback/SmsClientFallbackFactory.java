package com.jhhs.taxi.passenger.fallback;


import com.jhhs.taxi.common.dto.ResponseResult;
import com.jhhs.taxi.common.dto.sms.SmsSendRequest;
import com.jhhs.taxi.passenger.service.SmsClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class SmsClientFallbackFactory implements FallbackFactory<SmsClient> {

    @Override
    public SmsClient create(Throwable cause) {
        return new SmsClient() {

            @Override
            public ResponseResult sendSms(SmsSendRequest smsSendRequest) {
                System.out.println("feign异常：" + cause);
                return ResponseResult.fail("feign fallback factory熔断");
            }
        };
    }

}
