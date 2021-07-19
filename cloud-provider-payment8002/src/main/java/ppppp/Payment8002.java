package ppppp;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import java.time.ZonedDateTime;

/**
 * @author pppppp
 * @date 2021/6/30 11:36
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002 {
    public static void main(String[] args){
        SpringApplication.run(Payment8002.class,args);
    }

    @Test
    public void T_1(){
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

    }
}
