package controller;

import entity.PetInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.impl.PetInfoServiceImpl;
import service.impl.PetTyepServiceImpl;


@Controller
public class addController {


    @Autowired
    private PetInfoServiceImpl ps;

    @Autowired
    private PetTyepServiceImpl pt;



    @RequestMapping("/selectType")
    public String selectType(Model model){

        model.addAttribute("tlist",pt.findAll());

        return "update";
    }

    @RequestMapping("/add")
    public String add(PetInfo petInfo){

        int i = ps.addPetInfo(petInfo);

        if (i>0){
            return "index";
        }else {
            return "index";
        }

    }




}
