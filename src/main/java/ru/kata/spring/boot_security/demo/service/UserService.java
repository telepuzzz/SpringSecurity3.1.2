package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findUserById(Long userId);
    List<User> allUsers();
    void deleteUser(Long userId);
    void updateUser(User user);

    Object findByUsername(String name);

    void save(User user);
}