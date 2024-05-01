package com.iot.usercenter;

import com.mayphyr.iotfeign.config.DefaultFeignConfig;
import com.mayphyr.iotfeign.rpc.apipass.ApiPassClient;
import com.mayphyr.iotfeign.rpc.interfaces.CheckAccessClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;


// Generated by https://start.springboot.io
// 优质的 spring/boot/data/security/cloud 框架中文文档尽在 => https://springdoc.cn


@SpringBootApplication()
@MapperScan("com.iot.usercenter.mapper")
@EnableScheduling
@EnableFeignClients(clients = {CheckAccessClient.class, ApiPassClient.class},defaultConfiguration = DefaultFeignConfig.class)
public class IotUsercenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotUsercenterApplication.class, args);
    }

}
