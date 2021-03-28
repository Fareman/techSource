package ru.shop.techSource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shop.techSource.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
