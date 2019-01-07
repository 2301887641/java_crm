package com.time.crm.dao.api;

import com.time.crm.service.dto.BaseDto;

/**
 * 基类接口
 * @author suiguozhen on 19-1-4 下午8:27
 */
public interface BaseDao<DTO extends BaseDto> {
    void save(DTO entity);
}
