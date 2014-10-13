package com.gmail.krvmax.entity;

import java.util.Date;
import java.util.List;

/**
 * author: Maxim Diland
 */
public class Product {

    private long id;
    private String name;
    private String description;
    private User owner;
    private float price;
    private Category category;
    private List<String> imageUrls;
    private boolean isOnTop;
    private Date addDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public boolean isOnTop() {
        return isOnTop;
    }

    public void setOnTop(boolean onTop) {
        isOnTop = onTop;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
