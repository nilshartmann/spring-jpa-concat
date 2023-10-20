package com.example.springjpaconcat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {

    @Id
    private String id;

    private String title;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
