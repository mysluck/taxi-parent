package com.jhhs.taxi.servicesms.dao.mapper;

import com.jhhs.taxi.servicesms.dao.entity.ServiceSmsTemplate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServiceSmsTemplateCustomMapper extends ServiceSmsTemplateMapper {

    ServiceSmsTemplate selectByTemplateId(String templateId);

}
