package com.twu.biblioteca.Domain;

import java.util.List;

/**
 * Created by zyongliu on 16/8/11.
 */
public class Book extends Production{
    public Book(String id, String name, int publishYear, List<Author> authors) {
        super( name, publishYear, authors );
        this.id = id;
    }

    public String getId() {
        return id;
    }

    private String id;
}
