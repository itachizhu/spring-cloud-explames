package org.itachi.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by itachi on 2017/5/22.
 * User: itachi
 * Date: 2017/5/22
 * Time: 21:08
 */
@FeignClient(name = "eureka-producer", fallback = HelloRemote.HystrixFallback.class)
public interface HelloRemote {
    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);

    @Component
    class HystrixFallback implements HelloRemote {

        @Override
        public String hello(String name) {
            return "我操，调用服务妈个比了！" + System.currentTimeMillis();
        }
    }
}
