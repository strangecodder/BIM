package com.example.bimmonitoring.Controller;

import ch.qos.logback.core.model.Model;
import com.example.bimmonitoring.Entities.Warehouse;
import com.example.bimmonitoring.Repositories.WarehouseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/warehouse")
public class WarehouseController {

    private final WarehouseRepository warehouseRepository;

    @Autowired
    public WarehouseController(WarehouseRepository warehouseRepository){
        this.warehouseRepository = warehouseRepository;
    }

    //Добавление в бд
    @PostMapping("/")
    public String postWarehouse(@RequestParam(value = "name", required = false, defaultValue = "nm") String name, Model model ){
        Warehouse warehouse = new Warehouse(name);
        warehouseRepository.save(warehouse);
        return "";
    }

    @GetMapping("/add")
    public String getWarehouseAdd(){
        return "warehouseadd";
    }

    @GetMapping("/show")
    public String getWarehouseShow(){
        return "warehousepage";
    }

    @GetMapping("/")
    public String getWarehouse(){
        return "warehouseinit";
    }
}
