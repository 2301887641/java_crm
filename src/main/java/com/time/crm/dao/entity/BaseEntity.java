package com.time.crm.dao.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author suiguozhen on 19-1-5 下午9:08
 */
@Getter
@Setter
public class BaseEntity {
    private Long id;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}
