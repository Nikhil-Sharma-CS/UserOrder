package org.example.UserOrder.Service;

import org.example.UserOrder.Model.User;
import org.example.UserOrder.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String addUsers(List<User> users) {
        iUserRepo.saveAll(users);
        return "Users Added";
    }

    public User getUser(Integer id) {
        return iUserRepo.findByuserId(id);
    }
}
