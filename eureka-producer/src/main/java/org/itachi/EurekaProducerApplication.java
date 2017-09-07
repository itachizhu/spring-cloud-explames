package org.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by itachi on 2017/9/4.
 * User: itachi
 * Date: 2017/9/4
 * Time: 10:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerApplication.class, args);
    }
}
