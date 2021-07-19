package ppppp.config;

/**
 * @author pppppp
 * @date 2021/7/18 17:10
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"ppppp.dao"})
public class MyBatisConfig {
}

