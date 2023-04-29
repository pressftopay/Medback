package com.example.demo.Controllers;

import com.example.demo.Repo.medsRepoImplq;


import com.example.demo.Services.medsRepo;
import com.example.demo.entity.meds;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.Locale;

@RestController
@AllArgsConstructor
@Service
@Log
@RequestMapping("/meds")
public class drugController {
    private final medsRepo drugService;
    private medsRepoImplq q;
    @GetMapping("/test")
    public String test(){
        return "test";
    }
    @PostMapping("/save")
    public meds save(@RequestBody meds drug) {
        return drugService.save(drug);
    }
    @GetMapping("/findname")
    public meds findByName(@RequestBody meds meds){

        return drugService.findByName(meds.getName());
    }

    @GetMapping("/findnamest")
    public List<meds> findByNameStartingWith(@RequestBody meds meds){
        return drugService.findByNameStartingWith(meds.getName());
    }
    @GetMapping("/search")
    public List<meds> findSearch(@RequestParam String name)
    {
        String nm = name.substring(1).toLowerCase();


        System.out.println(nm);
        return q.findS(nm);
    }
    @GetMapping("/findID")
    public meds findByID( long ID){
        return drugService.findByID(ID);
    }
    @GetMapping("/getm")
    public List<meds> getAll(){return drugService.findAll();}
    @GetMapping("/top4")
    public List<meds> top4(){
        return q.find1();
    }
    @GetMapping("/topd")
    public List<meds> topgg(){
        return q.find2();
    }
}
