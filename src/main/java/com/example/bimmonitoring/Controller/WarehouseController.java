package com.example.bimmonitoring.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/warehouse")
public class WarehouseController {

    @GetMapping("/")
    public String getWarehouse(){
        return "warehousepage";
    }
}
