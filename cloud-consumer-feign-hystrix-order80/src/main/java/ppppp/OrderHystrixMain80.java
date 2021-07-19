package ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author pppppp
 * @date 2021/6/30 16:36
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix//添加到此处Hystrix
public class OrderHystrixMain80  {
    public static void main(String[] args){
        SpringApplication.run(OrderHystrixMain80 .class,args);
    }
}
