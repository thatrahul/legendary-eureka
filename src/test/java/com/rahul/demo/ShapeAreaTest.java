package com.rahul.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xbbl129 on 5/9/17.
 */
public class ShapeAreaTest {

    final ShapeArea checker = new ShapeArea();
    @Test
    public void shapeArea1() throws Exception {
        int area = checker.shapeArea(1);
        assertEquals("non matching area", 1, area);
    }

    @Test
    public void shapeArea2() throws Exception {
        int area = checker.shapeArea(2);
        assertEquals("non matching area", 5, area);
    }

    @Test
    public void shapeArea3() throws Exception {
        int area = checker.shapeArea(3);
        assertEquals("non matching area", 13, area);
    }
}