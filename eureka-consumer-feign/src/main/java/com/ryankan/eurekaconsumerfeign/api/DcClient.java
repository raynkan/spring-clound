package com.ryankan.eurekaconsumerfeign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: ryan
 * @Description:
 * @Date: Created in 2:56 PM 2019/4/20
 * @Modified By:
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
