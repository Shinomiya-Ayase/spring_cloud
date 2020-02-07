package org.java.controller;

import org.java.entity.Dept;
import org.java.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/findById/{id}")
    public Dept findById(@PathVariable Long id){
        return deptService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @GetMapping("/discover")
    public DiscoveryClient discover(){
        for (ServiceInstance instance : client.getInstances("SPRINGCLOUD-PROVIDER-DEPT")) {
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId()
            );
        }
        return client;
    }
}
