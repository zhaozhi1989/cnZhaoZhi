package com.george;

import com.george.sharding.entity.OrderDO;
import com.george.sharding.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhaozhi
 * @description
 * @since 2020/7/31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testAdd() {
        OrderDO orderDO = new OrderDO();
        orderDO.setUserId(11);
        orderService.add(orderDO);
    }

    @Test
    public void testFindById() {
        System.out.println(orderService.findById(11));
    }
}
