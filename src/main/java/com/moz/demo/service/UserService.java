package com.moz.demo.service;

import java.util.List;
import java.util.Optional;

import com.moz.demo.model.UserDao;

public interface UserService {
    abstract UserDao createForm(UserDao user);
    abstract List<UserDao> getForms();
    abstract Optional<UserDao> getFormWithId(String id);
    abstract String deleteForm(String id);
}
