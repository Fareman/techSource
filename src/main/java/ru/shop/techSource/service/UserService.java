package ru.shop.techSource.service;

import ru.shop.techSource.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
