package org.itachi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by itachi on 2017/9/11.
 * User: itachi
 * Date: 2017/9/11
 * Time: 09:19
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
