package com.time.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author suiguozhen on 19-1-3 下午9:00
 */
@Controller
public class IndexController {

    @GetMapping("/index.do")
    public String index(){
        return "index";
    }
}
