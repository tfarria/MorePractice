package com.example.demo;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Book implements Serializable {
    private String title;
    private String author;
    private int year;
    private int number;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
