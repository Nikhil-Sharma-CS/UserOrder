package org.example.UserOrder.Repository;

import jakarta.transaction.Transactional;
import org.example.UserOrder.Model.Category;
import org.example.UserOrder.Model.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findByprodCategory(Category category); //Return list of products by category
}
