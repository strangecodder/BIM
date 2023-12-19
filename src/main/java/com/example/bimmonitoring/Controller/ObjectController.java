package com.example.bimmonitoring.Controller;

//import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;
import com.example.bimmonitoring.Entities.ObjectInfo;
import com.example.bimmonitoring.Repositories.ObjectInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/object")
public class ObjectController {

    @Autowired
    private ObjectInfoRepository objectInfoRepository;



    @GetMapping("/add")
    public String getObjectAdd(){
        return "objectpageadd";
    }

    @GetMapping("/show")
    public String getObjectShow(Model model){
        Iterable<ObjectInfo> infos = objectInfoRepository.findAll();
        model.addAttribute("infos",infos);
        return "objectpage";
    }

    @GetMapping("/")
    public String getObject(){
        return "objectpageinit";
    }

    @PostMapping("/add")
    public String postObjectAdd(@RequestParam String objectAddress,@RequestParam int workers_quantity,
            @RequestParam String organisation,  Model model){
        ObjectInfo objectInfo = new ObjectInfo(objectAddress, workers_quantity, organisation);
        objectInfoRepository.save(objectInfo);
        return "redirect:/objectpage";
    }
}
