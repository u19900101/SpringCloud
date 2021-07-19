package ppppp.service;

import org.apache.ibatis.annotations.Param;
import ppppp.entities.Payment;

/**
 * @author pppppp
 * @date 2021/6/30 14:57
 */

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
