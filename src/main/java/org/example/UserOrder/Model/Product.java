package org.example.UserOrder.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prodId;
    private String prodName;

    private Integer prodPrice;
    private String prodDescription;

    @Enumerated(value = EnumType.STRING)
    private Category prodCategory;
    private String prodBrand;
}
