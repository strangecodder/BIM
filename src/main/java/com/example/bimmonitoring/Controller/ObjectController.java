package com.example.bimmonitoring.Controller;

//import ch.qos.logback.core.model.Model;
import com.example.bimmonitoring.Entities.WorkersGroup;
import com.example.bimmonitoring.Entities.WorkersInfo;
import jakarta.websocket.server.PathParam;
import org.springframework.ui.Model;
import com.example.bimmonitoring.Entities.ObjectInfo;
import com.example.bimmonitoring.Repositories.ObjectInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

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
    public String postObjectAdd(@RequestParam String object_address,
                                @RequestParam String organisation, @RequestParam Set<WorkersInfo> workers_group_id, Model model){
        ObjectInfo objectInfo = new ObjectInfo(object_address, organisation,workers_group_id);
        objectInfoRepository.save(objectInfo);
        return "redirect:/object/show";
    }

    @GetMapping("/show/{id}/edit")
    public String objectEdit(@PathParam(value = "id") int id, Model model){
        if(!objectInfoRepository.existsById(id)){
            return "redirect:/";
        }

        Optional<ObjectInfo> infoOptional = objectInfoRepository.findById(id);
        ArrayList<ObjectInfo> objectInfoArrayList = new ArrayList<>();
        infoOptional.ifPresent(objectInfoArrayList::add);
        model.addAttribute("infoOptional", objectInfoArrayList);
        return "details";
    }

    @GetMapping("/show/{id}")
    public String getDetails(@PathVariable(value = "id") int id, Model model){
        if(!objectInfoRepository.existsById(id)){
            return "redirect:/";
        }

        Optional<ObjectInfo> infoOptional = objectInfoRepository.findById(id);
        ArrayList<ObjectInfo> objectInfoArrayList = new ArrayList<>();
        infoOptional.ifPresent(objectInfoArrayList::add);
        model.addAttribute("infoOptional", objectInfoArrayList);
        return "details";
    }
}
