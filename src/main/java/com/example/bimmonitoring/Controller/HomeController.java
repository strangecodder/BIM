package com.example.bimmonitoring.Controller;

import com.example.bimmonitoring.Repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(){
        return "Desktop1";
    }

    @GetMapping("/Ice")
    public String getIce(){
        return "Ice";
    }
}
