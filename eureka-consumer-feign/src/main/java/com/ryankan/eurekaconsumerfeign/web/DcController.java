package com.ryankan.eurekaconsumerfeign.web;

import com.ryankan.eurekaconsumerfeign.api.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ryan
 * @Description:
 * @Date: Created in 2:58 PM 2019/4/20
 * @Modified By:
 */
@RestController
public class DcController {
    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
}

