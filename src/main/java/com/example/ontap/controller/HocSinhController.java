package com.example.ontap.controller;

import com.example.ontap.entities.HocSinh;
import com.example.ontap.servieces.HocSinhServiceImpl;
import com.example.ontap.servieces.LopHocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hocsinh")
public class HocSinhController {

    @Autowired
    private HocSinhServiceImpl hocSinhService;
    @Autowired
    private LopHocServiceImpl lopHocService;

    @PostMapping("/add")
    public ModelAndView add(@Validated HocSinh hs, @RequestParam String lhId) {
        hocSinhService.add(hs);
        ModelAndView model = new ModelAndView();
        model.addObject("HS", hocSinhService.find(lhId));
        model.addObject("ldId", lhId);
        model.setViewName("redirect:/hocsinh/search?lhId="+lhId);
        return model;
    }

    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam String id, @RequestParam String lhId) {
        hocSinhService.delete(id);
        ModelAndView model = new ModelAndView();
        model.addObject("HS", hocSinhService.find(lhId));
        model.addObject("ldId", lhId);
        model.setViewName("redirect:/hocsinh/search?lhId="+lhId);
        return model;
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam String lhId) {
        ModelAndView model = new ModelAndView();
        model.addObject("HS", hocSinhService.find(lhId));
//        model.addObject("ldId", lhId);
        model.setViewName("HocSinh");
        return model;
    }
}
