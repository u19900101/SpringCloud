package ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pppppp
 * @date 2021/6/30 11:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//添加该注解

public class Payment8001 {
    public static void main(String[] args){
        SpringApplication.run(Payment8001.class,args);
    }
}
