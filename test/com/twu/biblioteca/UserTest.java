package com.twu.biblioteca;

import com.twu.biblioteca.Domain.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by zyongliu on 16/8/11.
 */
public class UserTest {
    User user;
    @Test
    public void testNullConstructor() throws Exception {
        User user = new User();
        checkOriginalValueExceptForName();
        assertEquals("",user.getName());
    }

    @Test
    public void testNonNullConstructor() throws Exception {
        user = new User("testName");
        checkOriginalValueExceptForName();
        assertEquals("testName", user.getName());
    }

    private void checkOriginalValueExceptForName() {
        assertEquals("", user.getAddress());
        assertEquals("",user.getEmail());
        assertEquals("", user.getLibNum());
        assertEquals("",user.getPassword());
        assertEquals("", user.getPhoneNumber());
        assertNotNull(user.getCheckHistory());
    }

}
