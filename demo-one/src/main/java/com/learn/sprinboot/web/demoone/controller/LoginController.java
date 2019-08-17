package com.learn.sprinboot.web.demoone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginMessage(@RequestParam String name, ModelMap model){
        if(name == null || name.equals("")){
            model.put("name", "Boss");
        }else{
            model.put("name", name);
        }

        return "login";
    }
}
