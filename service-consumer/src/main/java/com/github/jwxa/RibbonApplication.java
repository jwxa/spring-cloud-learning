package com.github.jwxa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 使用Ribbon实现客户端负载均衡的消费者
 * <p>
 * 方法描述列表
 * </p>
 * User: Jwxa Date: 2017/4/22 ProjectName: spring-cloud-learning Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient//@EnableEurekaClient 这两个注解的区别是@EnableEurekaClient专门指使用Eureka,而@EnableDiscoveryClient可以灵活配置Eureka, consul, zookeeper
@EnableCircuitBreaker//注解开启断路器功能
public class RibbonApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

}
