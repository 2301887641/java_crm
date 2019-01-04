package com.time.crm.dao.impl;

import com.time.crm.dao.api.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 基类
 * @author suiguozhen on 19-1-4 下午8:27
 */
public class BaseDaoImpl implements BaseDao {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
