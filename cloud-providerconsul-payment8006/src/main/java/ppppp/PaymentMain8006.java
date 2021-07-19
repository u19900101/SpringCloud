package ppppp;

/**
 * @author pppppp
 * @date 2021/7/8 21:50
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class, args);
    }
}
