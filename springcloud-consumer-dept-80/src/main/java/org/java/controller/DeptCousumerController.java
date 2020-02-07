package org.java.controller;

import org.java.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/cousumer")
public class DeptCousumerController {
    @Autowired
    private RestTemplate restTemplate;
    //private String url = "http://localhost:8001/dept";
    private String url = "http://springcloud-provider-dept/dept";

    @GetMapping("/findById/{id}")
    public Dept findById(@PathVariable Long id){
        return restTemplate.getForObject(url+"/findById/"+id,Dept.class);
    }

    @GetMapping("/findAll")
    public List<Dept> findAll(){
        return restTemplate.getForObject(url+"/findAll",List.class);
    }
}
