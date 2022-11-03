package com.moz.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moz.demo.model.UserDao;
import com.moz.demo.model.UserRepository;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public UserDao createForm(UserDao user) {
        return repository.save(user);
    }

    @Override
    public List<UserDao> getForms() {
        return repository.findAll();
    }

    @Override
    public Optional<UserDao> getFormWithId(String id) {
        return repository.findById(id);
    }

    @Override
    public String deleteForm(String id) {
        boolean isFound = repository.existsById(id);
        if (isFound){
            repository.deleteById(id);
            return "Successfully deleted form with id : " + id;
        }
        return "User not found";
    }

}
