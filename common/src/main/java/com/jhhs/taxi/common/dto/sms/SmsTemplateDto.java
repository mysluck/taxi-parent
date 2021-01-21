package com.jhhs.taxi.common.dto.sms;

import lombok.Data;

import java.util.Map;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/20 15:21
 * @Description
 */
@Data
public class SmsTemplateDto {

	private String id;

	private Map<String, Object> templateMap;

	@Override
	public String toString() {
		return "SmsTemplateDto [id=" + id + ", templateMap=" + templateMap + "]";
	}

}