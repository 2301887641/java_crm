package com.time.crm.controller;

import com.time.crm.service.api.UserService;
import com.time.crm.service.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author suiguozhen on 19-1-3 下午9:00
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/index.do")
    public String index(){
        return "index";
    }

    @GetMapping("/add.do")
    public String add(UserDto userDto){
        return "top";
    }
}
