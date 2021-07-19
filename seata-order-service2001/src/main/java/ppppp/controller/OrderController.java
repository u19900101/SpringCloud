package ppppp.controller;

/**
 * @author pppppp
 * @date 2021/7/18 17:09
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ppppp.dao.OrderDao;
import ppppp.entities.CommonResult;
import ppppp.entities.Order;
import ppppp.service.OrderService;

import javax.annotation.Resource;

@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;

    @Resource
    private OrderDao orderDao;

    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
