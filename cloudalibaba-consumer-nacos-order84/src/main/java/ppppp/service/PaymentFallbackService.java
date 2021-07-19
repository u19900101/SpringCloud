package ppppp.service;
import org.springframework.stereotype.Component;
import ppppp.entities.CommonResult;
import ppppp.entities.Payment;
/**
 * @author pppppp
 * @date 2021/7/17 21:30
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}