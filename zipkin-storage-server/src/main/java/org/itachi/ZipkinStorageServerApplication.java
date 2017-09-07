package org.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by itachi on 2017/9/3.
 * User: itachi
 * Date: 2017/9/3
 * Time: 16:15
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinStorageServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinStorageServerApplication.class, args);
    }
}
