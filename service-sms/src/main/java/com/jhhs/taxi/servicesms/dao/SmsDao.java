package com.jhhs.taxi.servicesms.dao;

import com.jhhs.taxi.servicesms.dao.entity.ServiceSmsRecord;
import com.jhhs.taxi.servicesms.dao.mapper.ServiceSmsRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yueyi2019
 */
@Service
public class SmsDao {
	
	@Autowired
	private ServiceSmsRecordMapper serviceSmsRecordMapper;
	
	public int insert(ServiceSmsRecord serviceSmsRecord) {
		
		return serviceSmsRecordMapper.insertSelective(serviceSmsRecord);
	}
}
