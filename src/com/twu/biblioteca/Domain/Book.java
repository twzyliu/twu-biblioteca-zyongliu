package com.twu.biblioteca.Domain;

import java.util.List;

/**
 * Created by zyongliu on 16/8/11.
 */
public class Book {
    private final String name;
    private final List<Author> authors;
    private final int publishYear;
    private int state;
    private String id;

    public Book(String id, String name,  List<Author> authors, int publishYear) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishYear = publishYear;
        state = 0;
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthor() {
        return authors;
    }

    public String getAuthorName() {
        StringBuilder name = new StringBuilder();
        for(Author author: authors) {
            name.append(author.getName() + ", ");
        }
        return name.substring(0, name.length()-2);
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }
    public boolean isAvailable(){
        return state == 0;
    }
}
