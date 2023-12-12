package com.example.bimmonitoring.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/object")
public class ObjectController {

    @GetMapping("/add")
    public String getObjectAdd(){
        return "objectpageadd";
    }

    @GetMapping("/init")
    public String getObjectInit(){
        return "objectpageinit";
    }

    @GetMapping("/")
    public String getObject(){
        return "objectpage";
    }
}
