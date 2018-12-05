package com.oldmee.sericefeign.com.oldmee.sericefeign.controller;

import com.oldmee.sericefeign.com.oldmee.sericefeign.service.SayHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:33 2018/12/5
 */

@RestController
public class HelloController {

    @Autowired
    private SayHi sayHi;

    @RequestMapping("/sayhihihi")
    public String hihihi(@RequestParam("name") String name) {
        return sayHi.sayHiFromOneClient(name);
    }

}
