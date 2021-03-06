package com.twu.biblioteca;

import com.twu.biblioteca.Domain.ProductionList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by zyongliu on 16/8/11.
 */
public class ProductionListTest {
    @Test
    public void getBook() throws Exception {

    }

    @Test
    public void getTotalCount() throws Exception {
        assertEquals(10, ProductionList.getTotalCount());
    }

    @Test
    public void checkoutBookRight() throws Exception {
        ProductionList.checkoutProduction("1");
        assertTrue(ProductionList.getAvailableProductions().size()==9 && !ProductionList.getAvailableProductions().contains("1"));
        ProductionList.returnProduction("1");
        System.out.println("show book lists");
        System.out.println(ProductionList.getAvailableProductions());
    }

    @Test
    public void checkoutBookWrong() throws Exception {
        ProductionList.checkoutProduction("1");
        ProductionList.checkoutProduction("1");
        assertTrue(ProductionList.getAvailableProductions().size()==9 && !ProductionList.getAvailableProductions().contains("1"));
        ProductionList.returnProduction("1");
        System.out.println("show book lists");
        System.out.println(ProductionList.getAvailableProductions());
    }

    @Test
    public void returnBookRight() throws Exception {
        ProductionList.checkoutProduction("1");
        ProductionList.returnProduction("1");
        assertTrue(ProductionList.getAvailableProductions().size()==10 && ProductionList.getAvailableProductions().contains("1"));
        System.out.println("show book lists");
        System.out.println(ProductionList.getAvailableProductions());
    }

    @Test
    public void returnBookWrong() throws Exception {
        ProductionList.returnProduction("0");
        Arrays.sort(ProductionList.getAvailableProductions().toArray());
        assertTrue(ProductionList.getAvailableProductions().size()==10 && ProductionList.getAvailableProductions().contains("1"));
        System.out.println("show book lists");
        System.out.println(ProductionList.getAvailableProductions());
    }

    @Test
    public void getAvailableBooks() throws Exception {
        Arrays.sort(ProductionList.getAvailableProductions().toArray());
        assertTrue(ProductionList.getAvailableProductions().size()==10 && ProductionList.getAvailableProductions().contains("1"));
        System.out.println("show book lists");
        System.out.println(ProductionList.getAvailableProductions());
    }

    @Test
    public void createBookID() throws Exception {
        assertEquals("11", ProductionList.createProductionID());
    }

}
