package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua[xujiuhuamoney@163.com]
 * @create 2016-09-27-17:09
 */
@Controller
public class UserController {

    @RequestMapping("hello")
    public String hello(Model model, String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}
