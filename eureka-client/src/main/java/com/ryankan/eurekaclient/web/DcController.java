package com.ryankan.eurekaclient.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ryan
 * @Description:
 * @Date: Created in 2:01 PM 2019/4/20
 * @Modified By:
 */
@RestController
public class DcController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services:" + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
