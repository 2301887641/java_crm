package com.time.crm.service.api;

import com.time.crm.service.dto.BaseDto;

/**
 * @author suiguozhen on 19-1-4 下午8:31
 */
public interface BaseService<DTO> {
    void save(DTO dto);
}