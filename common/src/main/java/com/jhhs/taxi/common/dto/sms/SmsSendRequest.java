package com.jhhs.taxi.common.dto.sms;

import lombok.Data;

import java.util.List;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/20 15:21
 * @Description
 */
@Data
public class SmsSendRequest {
    private String[] receivers;
    private List<SmsTemplateDto> data;
}
