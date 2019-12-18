package com.controller;

import com.entity.Person_info;
import com.service.Person_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("person")
public class Person_infoController {
    @Resource
    Person_infoService person_infoService;

    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("list",person_infoService.findAll());
        return "personManager";
    }
    @RequestMapping("updateShow")
    @ResponseBody
    public Person_info updateShow(Integer person_id){
        return person_infoService.findById(person_id);
    }
    @ResponseBody
    @RequestMapping("add")
    public int add(Person_info person_info){
        return person_infoService.insert(person_info);
    }
    @RequestMapping("updateSubmit")
    @ResponseBody
    public int updateSubmit(Person_info person_info){
        return person_infoService.update(person_info);
    }
}
