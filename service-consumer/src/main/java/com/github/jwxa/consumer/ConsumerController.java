package com.github.jwxa.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: Jwxa Date: 2017/4/22 ProjectName: spring-cloud-learning Version: 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return consumerService.addService();
    }


}
