package com.github.jwxa.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: Jwxa Date: 2017/5/2 ProjectName: spring-cloud-learning Version: 1.0
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    private Registration registration;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello(){
        return registration.getServiceId();
    }

}
