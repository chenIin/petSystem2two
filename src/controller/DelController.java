package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.impl.PetInfoServiceImpl;

@RestController
public class DelController {


    @Autowired
    private PetInfoServiceImpl ps;


    //删除
    @RequestMapping("/del")
    public Object del(int id){
        System.out.println(id);
        int del = ps.delById(id);
        return del>0?true:false;

    }



}
