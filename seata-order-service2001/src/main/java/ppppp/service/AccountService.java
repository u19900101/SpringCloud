package ppppp.service;

/**
 * @author pppppp
 * @date 2021/7/18 17:07
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ppppp.entities.CommonResult;

import java.math.BigDecimal;

@FeignClient(value = "seata-account-service")
public interface AccountService
{
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
