package com.jhhs.taxi.servicesms.dao.mapper;

import com.jhhs.taxi.servicesms.dao.entity.ServiceSmsTemplate;

public interface ServiceSmsTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceSmsTemplate record);

    int insertSelective(ServiceSmsTemplate record);

    ServiceSmsTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceSmsTemplate record);

    int updateByPrimaryKey(ServiceSmsTemplate record);
}