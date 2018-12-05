package com.oldmee.sericefeign.com.oldmee.sericefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:28 2018/12/5
 */

@FeignClient(value = "service-hi")
public interface SayHi {

    @RequestMapping("/hi")
    String sayHiFromOneClient(@RequestParam("name") String name);
}
