package org.example.UserOrder.Controller;

import org.example.UserOrder.Model.Orders;
import org.example.UserOrder.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    //Post Orders
    @PostMapping("orders")
    String addOrder(@RequestBody Orders orders)
    {
        return ordersService.addOrder(orders);
    }

    //Get order by Id
    @GetMapping("getOrder/{Id}")
    Orders getOrder(@PathVariable Integer Id)
    {
        return ordersService.getOrder(Id);
    }

}
