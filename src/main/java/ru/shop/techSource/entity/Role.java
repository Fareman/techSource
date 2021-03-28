package ru.shop.techSource.entity;

import javax.persistence.*;

@Entity(name = "role")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Role;

    @Column(nullable = false)
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login", nullable = false)
    private User user;

    public Role(){}

    public long getId_Role() {
        return id_Role;
    }

    public void setId_Role(long id_Category) {
        this.id_Role = id_Category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
