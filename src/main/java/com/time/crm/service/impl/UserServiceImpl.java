package com.time.crm.service.impl;

import com.time.crm.dao.api.UserDao;
import com.time.crm.service.api.UserService;
import com.time.crm.service.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author suiguozhen on 19-1-6 上午7:50
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void save(UserDto dto) {
        userDao.save(dto);
    }
}
