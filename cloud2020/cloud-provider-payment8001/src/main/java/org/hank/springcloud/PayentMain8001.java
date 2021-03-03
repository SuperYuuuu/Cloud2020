package org.hank.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Hank
 * @date 2021/2/26
 */
@SpringBootApplication
@EnableEurekaClient
public class PayentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayentMain8001.class, args);
    }
}
