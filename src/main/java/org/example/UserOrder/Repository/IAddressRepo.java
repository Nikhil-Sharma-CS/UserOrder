package org.example.UserOrder.Repository;

import org.example.UserOrder.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
