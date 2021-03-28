package ru.shop.techSource.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "brand")

public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Brand;

    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
    private List<Product> Products = new ArrayList<>();

    public Brand(){}

    public void setId_Brand(long id) {
        this.id_Brand = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId_Brand() {
        return id_Brand;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }
}
