package com.github.jwxa.consumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: Jwxa Date: 2017/4/23 ProjectName: spring-cloud-learning Version: 1.0
 */
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")//断路器相关-注解来指定回调方法
    public String addService() {
        return restTemplate.getForEntity("http://SERVICE-PROVIDER/add?a=10&b=20", String.class).getBody();
    }

    /**
     * 断路器-回调方法
     * @return
     */
    public String addServiceFallback() {
        return "error";
    }

}
