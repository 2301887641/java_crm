package com.time.crm.service.impl;

import com.time.crm.dao.api.BaseDao;
import com.time.crm.dao.entity.BaseEntity;
import com.time.crm.service.api.BaseService;
import com.time.crm.service.dto.BaseDto;
import org.springframework.stereotype.Service;

/**
 * @author suiguozhen on 19-1-4 下午8:31
 */
public class BaseServiceImpl<DTO extends BaseDto,ENTITY extends BaseEntity,DAO extends BaseDao> implements BaseService<DTO> {

    @Override
    public void save(DTO dto) {

    }
}
