package com.jhhs.taxi.servicesms.controller;

import com.alibaba.fastjson.JSONObject;
import com.jhhs.taxi.common.dto.ResponseResult;
import com.jhhs.taxi.common.dto.sms.SmsSendRequest;
import com.jhhs.taxi.servicesms.service.AliService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yueyi2019
 */
@RestController
@RequestMapping("/send")
@Slf4j
public class SendController {
	
	@Autowired
	private AliService aliService;

	@RequestMapping(value = "/alisms-template",method = RequestMethod.POST)
    public ResponseResult send(@RequestBody SmsSendRequest smsSendRequest){
		//输出收到的参数内容
        JSONObject param = JSONObject.parseObject(JSONObject.toJSONString(smsSendRequest));
        log.info("/send/alisms-template   request："+param.toString());
        aliService.sendSms(smsSendRequest);
        return  ResponseResult.success("");
    }
	
}
