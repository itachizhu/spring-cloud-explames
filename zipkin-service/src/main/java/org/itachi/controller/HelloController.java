package org.itachi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by itachi on 2017/9/2.
 * User: itachi
 * Date: 2017/9/2
 * Time: 00:58
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    /*
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    */

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

    @GetMapping("/hello")
    public String info() {
        logger.info("calling trace demo backend");
        return "I'm zipkin service";
    }
}
