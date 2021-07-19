package ppppp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import ppppp.entities.CommonResult;
import ppppp.entities.Payment;
import ppppp.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author pppppp
 * @date 2021/6/30 15:12
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;//添加serverPort


    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result+"----server.port  is " + serverPort);

        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,result);
            //return new CommonResult(200,"插入数据库成功 " ,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null)
        {
            log.info("200  查询成功 " + payment +"  ----server.port  is " + serverPort);
            return new CommonResult(200,"查询成功,serverPort:  "+serverPort,payment);
            //return new CommonResult(200,"查询成功,serverPort:  ",payment);
        }else{
            log.info("没有对应记录  " + payment +"----server.port  is " + serverPort);
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;//返回服务接口
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // 业务逻辑处理正确，但是需要耗费3秒钟
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
