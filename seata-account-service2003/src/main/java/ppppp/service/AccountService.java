package ppppp.service;

/**
 * @author pppppp
 * @date 2021/7/18 17:06
 */

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}