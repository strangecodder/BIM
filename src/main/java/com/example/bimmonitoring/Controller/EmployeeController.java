package com.example.bimmonitoring.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/add")
    public String addEmployee(){
        return "employeeadd";
    }

    @GetMapping("/check")
    public String checkEmployee(){
        return "employeepage";
    }


    @GetMapping("/")
    public String getEmployeePage(){
        return "employeeinit";
    }
}
