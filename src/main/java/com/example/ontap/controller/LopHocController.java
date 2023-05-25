package com.example.ontap.controller;

import com.example.ontap.entities.LopHoc;
import com.example.ontap.servieces.LopHocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lophoc")
public class LopHocController {

    @Autowired
    private LopHocServiceImpl lopHocService;

    @PostMapping(value = "/add")
    public ModelAndView add(@Validated LopHoc lh){
        lopHocService.add(lh);
        ModelAndView model = new ModelAndView();
        model.addObject("Lop", lopHocService.findAll());
        model.setViewName("redirect:/lophoc/");
        return model;
    }

    @GetMapping("/search")
    public String search(@RequestParam String id){
        lopHocService.search(id);
        return "Insert lop hoc";
    }

    @GetMapping("/addView")
    public ModelAndView addview(){
        ModelAndView model = new ModelAndView();
        model.setViewName("ThemLopHoc");
        return model;
    }

    @GetMapping("/")
    public ModelAndView view(){
        ModelAndView model = new ModelAndView();
        model.addObject("Lop", lopHocService.findAll());
        model.setViewName("LopHoc");
        return model;
    }
}
