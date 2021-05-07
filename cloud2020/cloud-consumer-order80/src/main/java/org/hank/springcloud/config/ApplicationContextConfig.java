package org.hank.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Hank
 * @date 2021/3/2
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // 使用@LoadBalance注解赋予RestTemplate负载句哼的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
