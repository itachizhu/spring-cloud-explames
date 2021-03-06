package org.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by itachi on 2017/9/7.
 * User: itachi
 * Date: 2017/9/7
 * Time: 10:02
 */
// 没集成turbine时，下面的注解可以不用
@EnableCircuitBreaker
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixEurekaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixEurekaConsumerApplication.class, args);
    }
}
