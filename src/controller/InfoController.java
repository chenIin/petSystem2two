package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.impl.PetInfoServiceImpl;
import service.impl.PetTyepServiceImpl;


@Controller
public class InfoController {


    @Autowired
    private PetInfoServiceImpl ps;

    @Autowired
    private PetTyepServiceImpl pt;


    //查询所有
    @RequestMapping("/info/all")
    public String all(Model model){
        model.addAttribute("list",ps.findAll());
        model.addAttribute("tlist",pt.findAll());
        System.out.println(ps.findAll().toString());

        System.out.println("一共:"+ps.findAll().size());
        return "index";
    }

    //根据类型id查询
    @RequestMapping("/info/select")
    public String select(int aid,Model model){
       if (aid==0){
           model.addAttribute("list",ps.findAll());
       }else {
           model.addAttribute("list",ps.findByTidMo(aid));
       }

        model.addAttribute("tlist",pt.findAll());

        System.out.println(ps.findByTidMo(aid).toString());

        return "index";
    }




}
