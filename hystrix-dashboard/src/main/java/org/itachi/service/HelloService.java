package org.itachi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by itachi on 2017/9/7.
 * User: itachi
 * Date: 2017/9/7
 * Time: 11:31
 */
@Component
public class HelloService {
    private Random random = new Random();

    @HystrixCommand(fallbackMethod = "fallback")
    public String hello() {
        int rd = random.nextInt(10);
        if (rd < 8) {  //模拟调用失败情况
            throw new RuntimeException("call dependency service fail.");
        } else {
            return "UserName:itachi; number:" + rd;
        }
    }

    public String fallback() {
        return "我操你大爷的，给hystrix熔断了！";
    }
}
