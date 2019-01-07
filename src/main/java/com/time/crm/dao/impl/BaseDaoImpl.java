package com.time.crm.dao.impl;

import com.time.crm.dao.api.BaseDao;
import com.time.crm.service.dto.BaseDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

/**
 * 基类
 * @author suiguozhen on 19-1-4 下午8:27
 */
public class BaseDaoImpl<DTO extends BaseDto> implements BaseDao<DTO> {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(DTO dto) {
        getSession().save(dto);
    }
}