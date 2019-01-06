package com.time.crm.service.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author suiguozhen on 19-1-4 下午8:48
 */
@Getter
@Setter
public class UserDto extends BaseDto{
    private String mobile;
    private String username;
    private String email;
    private String password;
    private String salt;
    private String avatar;
    private Boolean administrator;
    private Boolean status;
    private String registerIp;
}
