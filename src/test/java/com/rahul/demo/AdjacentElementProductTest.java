package com.rahul.demo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by xbbl129 on 5/2/17.
 */
public class AdjacentElementProductTest {

    final AdjacentElementProduct adjacentElementProduct = new AdjacentElementProduct();

    @Test
    public void adjacentElementsProduct1() throws Exception {
        int[] input = {3, 6, -2, -5, 7, 3};
        int product = adjacentElementProduct.adjacentElementsProduct(input);
        assertEquals("Unexpected product", 21, product);
    }

    @Test
    public void adjacentElementsProduct2() throws Exception {
        int[] input = {3, 6};
        int product = adjacentElementProduct.adjacentElementsProduct(input);
        assertEquals("Unexpected product", 18, product);
    }

    @Test
    public void adjacentElementsProduct3() throws Exception {
        int[] input = {3, 0, 6};
        int product = adjacentElementProduct.adjacentElementsProduct(input);
        assertEquals("Unexpected product", 0, product);
    }

    @Test
    public void adjacentElementsProduct4() throws Exception {
        int[] input = {3, 0, 2, -6};
        int product = adjacentElementProduct.adjacentElementsProduct(input);
        assertEquals("Unexpected product", 0, product);
    }


    @Test
    public void adjacentElementsProduct5() throws Exception {
        int[] input = {-3, 2, -2, -1};
        int product = adjacentElementProduct.adjacentElementsProduct(input);
        assertEquals("Unexpected product", 2, product);
    }
}