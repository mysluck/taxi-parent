package com.jhhs.taxi.servicesms.service;


import com.jhhs.taxi.common.dto.sms.SmsSendRequest;

/**
 * @author yueyi2019
 */
public interface AliService {
	/**
	 * 发送短信
	 * @param request
	 * @return
	 */
	public int sendSms(SmsSendRequest request);
}
