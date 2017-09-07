package org.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created by itachi on 2017/9/1.
 * User: itachi
 * Date: 2017/9/1
 * Time: 23:55
 */
@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinStreamServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinStreamServerApplication.class, args);
    }
}
