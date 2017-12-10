package com.xiongyingqi.springcloud.feign.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xiongyingqi
 * @since 2017/12/10
 */
@ComponentScan("com.xiongyingqi.springcloud.feign")
@SpringBootApplication
@EnableCircuitBreaker
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
