package ru.shop.techSource.service;

import ru.shop.techSource.entity.Product;

import java.util.List;

public interface ProductService{
    List<Product> getAllProducts();
    void saveProduct(Product product);
    Product getProductById(long id);
    void deleteProductById(long id);
}
