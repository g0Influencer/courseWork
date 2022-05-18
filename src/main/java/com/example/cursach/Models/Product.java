package com.example.cursach.Models;


import org.hibernate.validator.constraints.Length;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;


// таблица в бд с книгами, для отображения пользователю

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String photo;



    private String description;
    private String author;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "price", nullable = false)
    @DecimalMin(value = "0.00", message = "*Price has to be non negative number")
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(Long id, String name, String photo, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
        this.description = description;
    }

}