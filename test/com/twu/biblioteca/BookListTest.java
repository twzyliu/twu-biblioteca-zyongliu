package com.twu.biblioteca;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by zyongliu on 16/8/11.
 */
public class BookListTest {
    @Test
    public void getBook() throws Exception {

    }

    @Test
    public void getTotalCount() throws Exception {
        assertEquals(10, BookList.getTotalCount());
    }

    @Test
    public void checkoutBookRight() throws Exception {
        BookList.checkoutBook("1");
        assertTrue(BookList.getAvailableBooks().size()==9 && !BookList.getAvailableBooks().contains("1"));
        BookList.returnBook("1");
        System.out.println("show book lists");
        System.out.println(BookList.getAvailableBooks());
    }

    @Test
    public void checkoutBookWrong() throws Exception {
        BookList.checkoutBook("1");
        BookList.checkoutBook("1");
        assertTrue(BookList.getAvailableBooks().size()==9 && !BookList.getAvailableBooks().contains("1"));
        BookList.returnBook("1");
        System.out.println("show book lists");
        System.out.println(BookList.getAvailableBooks());
    }

    @Test
    public void returnBookRight() throws Exception {
        BookList.checkoutBook("1");
        BookList.returnBook("1");
        assertTrue(BookList.getAvailableBooks().size()==10 && BookList.getAvailableBooks().contains("1"));
        System.out.println("show book lists");
        System.out.println(BookList.getAvailableBooks());
    }

    @Test
    public void returnBookWrong() throws Exception {
        BookList.returnBook("0");
        Arrays.sort(BookList.getAvailableBooks().toArray());
        assertTrue(BookList.getAvailableBooks().size()==10 && BookList.getAvailableBooks().contains("1"));
        System.out.println("show book lists");
        System.out.println(BookList.getAvailableBooks());
    }

    @Test
    public void getAvailableBooks() throws Exception {
        Arrays.sort(BookList.getAvailableBooks().toArray());
        assertTrue(BookList.getAvailableBooks().size()==10 && BookList.getAvailableBooks().contains("1"));
        System.out.println("show book lists");
        System.out.println(BookList.getAvailableBooks());
    }

    @Test
    public void createBookID() throws Exception {
        assertEquals("11", BookList.createBookID());
    }
}
