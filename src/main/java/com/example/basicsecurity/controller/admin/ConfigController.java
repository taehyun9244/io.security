package com.example.basicsecurity.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigController {
    @GetMapping("/admin")
    public String config(){
        return "admin/config";
    }
}
