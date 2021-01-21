package com.jhhs.taxi.servicesms.dao;

import com.jhhs.taxi.servicesms.dao.entity.ServiceSmsTemplate;
import com.jhhs.taxi.servicesms.dao.mapper.ServiceSmsTemplateCustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yueyi2019
 */
@Service
public class SmsTemplateDao {
	
	@Autowired
	private ServiceSmsTemplateCustomMapper serviceSmsTemplateCustomMapper;
	
	public ServiceSmsTemplate getByTemplateId(String templateId) {
		return serviceSmsTemplateCustomMapper.selectByTemplateId(templateId);
	}
}
