package com.example.student_db.controllers;

import com.example.student_db.models.FullName;
import com.example.student_db.services.FullNameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fullName")
public class FullNameController {

    private final FullNameService fullNameService;

    public FullNameController(FullNameService fullNameService) {
        this.fullNameService = fullNameService;
    }

    @GetMapping("/findByName")
    public List <FullName> findByName(@RequestParam String name){

        return fullNameService.findByName(name);
    }

    @GetMapping("/findByName2")
    public List <FullName> findByName2(@RequestParam String name){

        return fullNameService.findByName2(name);
    }
    @GetMapping("/findByName3")
    public List <FullName> findByName3(@RequestParam String name){

        return fullNameService.findByName3(name);
    }
}
