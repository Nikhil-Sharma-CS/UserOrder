package org.example.UserOrder.Service;

import org.example.UserOrder.Model.Address;
import org.example.UserOrder.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddresses(List<Address> addresses) {
        iAddressRepo.saveAll(addresses);
        return "Addresses Added";
    }
}
