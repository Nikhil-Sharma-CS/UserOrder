package org.example.UserOrder.Controller;

import org.example.UserOrder.Model.Address;
import org.example.UserOrder.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    //Add Addresses

    @PostMapping("addresses")
    String addAddresses(@RequestBody List<Address> addresses)
    {
        return addressService.addAddresses(addresses);
    }
}
