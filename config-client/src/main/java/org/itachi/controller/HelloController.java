package org.itachi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by itachi on 2017/9/1.
 * User: itachi
 * Date: 2017/9/1
 * Time: 14:08
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${name:World!}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        return "Hello " + name;
    }
}
