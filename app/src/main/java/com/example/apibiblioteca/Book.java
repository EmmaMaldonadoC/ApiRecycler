package com.example.apibiblioteca;

public class Book {
    private String title;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors != null && authors.length > 0 ? authors[0] : "Unknown Author";
    }
}
