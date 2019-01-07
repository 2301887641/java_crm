package com.time.crm.dao.impl;

import com.time.crm.dao.api.UserDao;
import com.time.crm.dao.entity.UserEntity;
import com.time.crm.service.dto.UserDto;
import org.springframework.stereotype.Repository;

/**
 * @author suiguozhen on 19-1-6 上午7:50
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<UserDto> implements UserDao {
}
