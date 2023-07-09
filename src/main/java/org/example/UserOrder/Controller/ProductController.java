package org.example.UserOrder.Controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.UserOrder.Model.Category;
import org.example.UserOrder.Model.Product;
import org.example.UserOrder.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //Add Products

    @PostMapping("products")
    String addProducts(@RequestBody List<Product> products)
    {
        return productService.addProducts(products);
    }

    //Get all products
    @GetMapping("products")
    Iterable<Product> getAllProds()
    {
        return productService.getAllProds();
    }

    //Get Products based on category
    @GetMapping("productByCat")
    List<Product> productByCat(@RequestParam Category category)
    {
      return productService.productByCat(category);
    }

    //Delete product by Id
    @DeleteMapping("products/{Id}")
    String deleteProduct(@PathVariable Integer Id)
    {
        return productService.deleteProduct(Id);
    }

}
