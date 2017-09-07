package org.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by itachi on 2017/9/4.
 * User: itachi
 * Date: 2017/9/4
 * Time: 11:16
 */
//@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulEurekaGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaGatewayApplication.class, args);
    }
}
