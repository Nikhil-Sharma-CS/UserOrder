package org.example.UserOrder.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ordersId;

    private Integer productQuantity;


    //All below mappings are one to one
    @ManyToOne
    @JoinColumn(name = "Fk_User_Id")
    User user;


    @ManyToOne
    @JoinColumn(name = "Fk_Product_Id")
    Product product;


    @ManyToOne
    @JoinColumn(name = "Fk_Address_Id")
    Address address;
}
