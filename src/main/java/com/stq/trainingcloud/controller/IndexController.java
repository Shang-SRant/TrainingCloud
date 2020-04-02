package com.stq.trainingcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @RequestMapping({"/index","/index.html"})
    public String index(String username, HttpSession session) {
        if (username.equals("1")) {
            session.setAttribute("level", "1");
        } else {
            session.setAttribute("level", "2");
        }
        return "/index";
    }

    @RequestMapping({"/", "/login", "/login.html"})
    public String test() {
        return "login";
    }

}