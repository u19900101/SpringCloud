package ppppp.service.imp;

import org.springframework.stereotype.Service;
import ppppp.dao.PaymentDao;
import ppppp.entities.Payment;
import ppppp.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author pppppp
 * @date 2021/6/30 14:58
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
