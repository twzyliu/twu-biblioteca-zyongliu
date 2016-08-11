package com.twu.biblioteca;

import com.twu.biblioteca.Domain.Author;
import com.twu.biblioteca.Domain.Book;
import com.twu.biblioteca.Domain.BookList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by zyongliu on 16/8/11.
 */
public class BookTest {
    private Book book;
    @Before
    public void setUp() throws Exception {
        List<Author> authors = new ArrayList<Author>();
        authors.add(new Author("James Whittaker"));
        authors.add(new Author("Jason Arbob"));
        authors.add(new Author("Jeff Carollo"));
        String id = BookList.createBookID();
        book = new Book(id, "How Google Tests Software", authors, 2012);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("How Google Tests Software", book.getName());
    }

    @Test
    public void getAuthor() throws Exception {

    }

    @Test
    public void getAuthorName() throws Exception {
        assertEquals("James Whittaker, Jason Arbob, Jeff Carollo", book.getAuthorName());
    }

    @Test
    public void getPublishYear() throws Exception {
        assertEquals(2012, book.getPublishYear());
    }

    @Test
    public void getState() throws Exception {
        assertEquals(0, book.getState());
    }

    @Test
    public void setState() throws Exception {
        book.setState(1);
        assertEquals(1, book.getState());
        book.setState(0);
    }

    @Test
    public void getId() throws Exception {
        assertEquals("11", book.getId());
    }

    @Test
    public void isAvailable() throws Exception {
        assertTrue(book.isAvailable());
    }
}
