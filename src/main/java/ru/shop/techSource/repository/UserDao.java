package ru.shop.techSource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shop.techSource.entity.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
