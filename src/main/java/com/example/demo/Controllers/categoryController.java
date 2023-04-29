package com.example.demo.Controllers;

import com.example.demo.Services.categoryRepo;
import com.example.demo.entity.category;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Service
@Log
@RequestMapping("/cat")
public class categoryController {
    private categoryRepo r;
    @PostMapping("/save")
    public category savec(category c){
        return r.save(c);
    }
    @GetMapping("/get")
    public List<category> getall(){
        return r.findAll();
    }
}
