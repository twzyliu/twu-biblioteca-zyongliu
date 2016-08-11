package com.twu.biblioteca;

import com.twu.biblioteca.Domain.CheckHistory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by zyongliu on 16/8/11.
 */
public class CheckHistoryTest {
    CheckHistory testCheckHistory;

    @Before
    public void setUp() throws Exception {
        testCheckHistory = new CheckHistory();
    }

    @Test
    public void getCheckedBooks() throws Exception {

    }

    @Test
    public void addCheckedBooks() throws Exception {
        testCheckHistory.addCheckedBooks("1");
        assertArrayEquals(new String[]{"1"}, testCheckHistory.getCheckedBooks().toArray());
    }

    @Test
    public void getToReturnBooks() throws Exception {

    }

    @Test
    public void addToReturnBooks() throws Exception {
        testCheckHistory.addToReturnBooks("1");
        assertArrayEquals(new String[]{"1"}, testCheckHistory.getToReturnBooks().toArray());
    }

    @Test
    public void getCheckedMovies() throws Exception {

    }

    @Test
    public void addCheckedMovies() throws Exception {
        testCheckHistory.addCheckedMovies("1");
        assertArrayEquals(new String[]{"1"}, testCheckHistory.getCheckedMovies().toArray());
    }

    @Test
    public void getToReturnMovies() throws Exception {

    }

    @Test
    public void addToReturnMovies() throws Exception {
        testCheckHistory.addToReturnMovies("1");
        assertArrayEquals(new String[]{"1"}, testCheckHistory.getToReturnMovies().toArray());
    }

}
