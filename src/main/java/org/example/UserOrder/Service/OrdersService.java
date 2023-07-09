package org.example.UserOrder.Service;

import org.example.UserOrder.Model.Orders;
import org.example.UserOrder.Repository.IOrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

    @Autowired
    IOrdersRepo iOrdersRepo;
    public String addOrder(Orders orders) {
        iOrdersRepo.save(orders);
        return "Order Saved";
    }


    public Orders getOrder(Integer id) {
        return iOrdersRepo.findByordersId(id);
    }
}
