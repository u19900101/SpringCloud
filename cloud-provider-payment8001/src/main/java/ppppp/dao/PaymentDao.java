package ppppp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ppppp.entities.Payment;

/**
 * @author pppppp
 * @date 2021/6/30 14:40
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
