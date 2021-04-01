package ru.shop.techSource.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "category")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Category;

    @Column(nullable = false)
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Product> Products = new ArrayList<>();

    public Category(){}

    public void setId_Category(long id) {
        this.id_Category = id;
    }

    public void setCategoryName(String name) {
        this.categoryName = name;
    }

    public long getId_Category() {
        return id_Category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }
}
