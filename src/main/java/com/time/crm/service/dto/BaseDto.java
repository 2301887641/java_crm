package com.time.crm.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author suiguozhen on 19-1-5 下午9:09
 */
@Getter
@Setter
public class BaseDto {
    private Long id;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}
