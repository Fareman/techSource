package ru.shop.techSource.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_product;

    @Column(length = 63535)
    @Type(type = "text")
    private String description;

    @Column
    private Byte[] image;

    @Column(nullable = false)
    private int inStock;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private Double price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Brand", nullable = false)
    private Brand brand;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Category", nullable = false)
    private Category category;

    public Product(){}

    public long getId_product() {
        return id_product;
    }

    public void setId_product(long id_product) {
        this.id_product = id_product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
