package com.chenson2910.mycrudboot.service;

import com.chenson2910.mycrudboot.model.User;

import java.util.List;

public interface UserService {
    List<User> listAll();

    void save(User user);

    User get(Integer id) throws UserNotFoundException;

    void delete(Integer id) throws UserNotFoundException;
}
