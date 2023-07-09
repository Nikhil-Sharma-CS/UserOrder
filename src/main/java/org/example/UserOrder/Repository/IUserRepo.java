package org.example.UserOrder.Repository;

import org.example.UserOrder.Model.User;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {

    User findByuserId(Integer Id);  //returns user by Id
}
