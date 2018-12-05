package com.oldmee.serviceribbon.controller;

import com.oldmee.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 17:03 2018/12/5
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return helloService.hiService(name);
    }
}
