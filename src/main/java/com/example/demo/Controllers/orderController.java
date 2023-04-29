package com.example.demo.Controllers;

import com.example.demo.Services.orderRepo;
import com.example.demo.entity.orders;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@AllArgsConstructor

@RestController
@RequestMapping("/orders")
public class orderController {
    private orderRepo oR;
    @PostMapping("/save")
    public orders saveorders(@RequestBody orders o){
        System.out.println(o.getId() + o.getCustomer_Firstname() + o.getPhone() + o.getAddress() + o.getTotalCost());
        return oR.save(o);
    }
}
