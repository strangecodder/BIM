package com.example.bimmonitoring.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/datastorage")
public class DataStorageController {

    @GetMapping("/")
    public String initDataStorage(){
        return "datastorage";
    }

    @GetMapping("/check")
    public String checkDataStorage(){
        return "datastorage2";
    }

    @GetMapping("/add")
    public String addDataStorage(){
        return "datastorage3";
    }

}
