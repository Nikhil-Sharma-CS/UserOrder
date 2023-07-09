package org.example.UserOrder.Service;

import org.example.UserOrder.Model.Category;
import org.example.UserOrder.Model.Product;
import org.example.UserOrder.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo iProductRepo;

    public String addProducts(List<Product> products) {
        iProductRepo.saveAll(products);
        return "Products Added";
    }

    public Iterable<Product> getAllProds() {
        return iProductRepo.findAll();
    }

    public String deleteProduct(Integer id) {
        iProductRepo.deleteById(id);
        return "Product Deleted";
    }

    public List<Product> productByCat(Category category) {
        return iProductRepo.findByprodCategory(category);
    }
}
