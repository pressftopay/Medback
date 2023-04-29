package com.example.demo.Controllers;

import com.example.demo.Services.consRepo;
import com.example.demo.Services.qRepo;
import com.example.demo.entity.cons;
import com.example.demo.entity.questionnary;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Service
@Log
@RequestMapping("/q")
public class qController {
    private qRepo qRepo;
    @PostMapping("/saveq")
    public questionnary savecons(@RequestBody questionnary q){
        return qRepo.save(q);
    }
    @GetMapping("/getAll")
    public List<questionnary> getAll(){
        return qRepo.findAll();
    }

}
