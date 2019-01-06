package com.time.crm.dao.api;

import com.time.crm.dao.entity.BaseEntity;

/**
 * 基类接口
 * @author suiguozhen on 19-1-4 下午8:27
 */
public interface BaseDao<ENTITY extends BaseEntity> {
    void save(ENTITY entity);
}
