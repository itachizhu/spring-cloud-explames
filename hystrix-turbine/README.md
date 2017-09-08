# hystrix-turbine

## 依次运行以下项目：
- eureka-server
- eureka-producer
- hystrix-eureka-consumer
- ribbon-hystrix-eureka-consumer
- hystrix-dashboard
- hystrix-turbine

## 浏览器运行
http://localhost:2222/hystrix
里面输入:
http://localhost:8031/turbine.stream 后点击Monitor Stream按钮。

## 调用对应的接口产生相关的数据
http://localhost:1117/hello/itachi
http://localhost:1119/hello/itachi

刷新数据，然后关掉eureka-producer项目再刷新一次。
