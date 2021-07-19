package ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author pppppp
 * @date 2021/6/30 16:36
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80  {
    public static void main(String[] args){
        SpringApplication.run(OrderFeignMain80 .class,args);
    }
}
