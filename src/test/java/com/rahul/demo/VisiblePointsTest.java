package com.rahul.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xbbl129 on 5/19/17.
 */
public class VisiblePointsTest {
    @Test
    public void visiblePoints1() throws Exception {
        int [][] input = {{1, 1}, {3, 1}, {3, 2}, {3, 3},
                {1, 3}, {2, 5}, {1, 5},
                {-1, -1},
                {-1, -2}, {-2, -3}, {-4, -4}
    };
        VisiblePoints vp = new VisiblePoints();
        int count = vp.visiblePoints(input);
        assertEquals("Incorrect", 6, count);
    }


    @Test
    public void visiblePoints2() throws Exception {
        int [][] input = {{27,-88},
                {76,56},
                {-82,62},
                {-5,48},
                {-85,60},
                {-86,6},
                {-100,-54},
                {-22,30},
                {58,47},
                {12,80}};
        VisiblePoints vp = new VisiblePoints();
        int count = vp.visiblePoints(input);
        assertEquals("Incorrect", 3, count);
    }


    @Test
    public void visiblePoints3() throws Exception {
        int [][] input = {{3,0},
                {-2,2}};
        VisiblePoints vp = new VisiblePoints();
        int count = vp.visiblePoints(input);
        assertEquals("Incorrect", 1, count);
    }



}