package org.example.UserOrder.Repository;

import org.example.UserOrder.Model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface IOrdersRepo extends CrudRepository<Orders, Integer> {

    Orders findByordersId(Integer Id);
}
