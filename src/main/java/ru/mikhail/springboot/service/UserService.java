package ru.mikhail.springboot.service;

import ru.mikhail.springboot.model.User;
import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    void saveUser(User user);
    User findUserById(Long id);
    void deleteUserById(Long id);
}