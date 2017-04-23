package com.github.jwxa.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用失败 断路器-指定回调类
 * <p>
 * 方法描述列表
 * </p>
 * User: Jwxa Date: 2017/4/23 ProjectName: spring-cloud-learning Version: 1.0
 */
@Component
public class ComputeClientHystrix implements ComputeClient {
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
