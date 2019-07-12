package com.wyb.pojo;

import java.io.Serializable;

public class Book1 implements Serializable {
    private Integer id;
    private String title;
    private String image;
    private String author;
    private Double price;

    public Book1(Integer id, String title, String image, String author, Double price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.author = author;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book1{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
