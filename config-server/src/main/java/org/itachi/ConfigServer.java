package org.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by itachi on 2017/9/1.
 * User: itachi
 * Date: 2017/9/1
 * Time: 00:19
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConfigServer.class, args);
    }
}
