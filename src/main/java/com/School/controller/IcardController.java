package com.School.controller;

import com.School.entities.Icard;
import com.School.entities.Subjects;
import com.School.entities.Teacher;
import com.School.services.IcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/icard")
public class IcardController {

    @Autowired
    IcardService icardService;

    @GetMapping("/getall")
    public List<Icard> getAllIcards(){
        return icardService.getAllIcards();
    }

    @PostMapping("/add")
    public Icard AddIcard(@RequestBody Icard icard){
        return icardService.addIcard(icard);
    }
}
