package com.example.demo.Controllers;

import com.example.demo.Services.consRepo;
import com.example.demo.entity.cons;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cons")
@AllArgsConstructor
public class consController {
    private  consRepo consRepoq;

    @PostMapping("/saveCons")
    public cons savecons(@RequestBody cons cosn){

        System.out.println(cosn.getID() + cosn.getPhone() + cosn.getC_name() + cosn.getQuestions());
        return consRepoq.save(cosn);
    }
    @GetMapping("/getAll")
    public List<cons> getAll(){
        return consRepoq.findAll();
    }
    @GetMapping("/allChecked")
    public List<cons> getChecked(){

        List<cons> op;
        op = consRepoq.findAll();
       int oq = op.size();
       ArrayList<cons> result = new ArrayList<>();
        for(int i = 0; i<oq;i++ ){
            if(op.get(i).isChecked()){
                result.add(op.get(i));
            }

        }
        return result;
    }
}
