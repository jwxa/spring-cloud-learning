package com.github.jwxa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

/**
 * 通过Feign以接口和注解配置的方式，轻松实现了对service-provider服务的绑定，
 * 这样我们就可以在本地应用中像本地服务一下的调用它，并且做到了客户端均衡负载。
 * <p>
 * 方法描述列表
 * </p>
 * User: Jwxa Date: 2017/4/22 ProjectName: spring-cloud-learning Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//注解开启Feign功能
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
