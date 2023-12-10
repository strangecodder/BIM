package com.example.bimmonitoring.Controller;

import com.example.bimmonitoring.Repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
//    private final MaterialRepository materialRepository;
//
//    @Autowired
//    public HomeController(MaterialRepository materialRepository) {
//        this.materialRepository = materialRepository;
//    }
//
//    @PostMapping("/")
//    public String postName(@RequestParam(value = "name", required = false, defaultValue = "mat") String name){
//        materialRepository.queryByName(name);
//        return "Desktop1";
//    }

    @GetMapping("/")
    public String getHome(){
        //materialRepository.queryByName("");
        return "Desktop1";
    }

}
