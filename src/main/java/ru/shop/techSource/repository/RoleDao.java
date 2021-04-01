package ru.shop.techSource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shop.techSource.entity.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
