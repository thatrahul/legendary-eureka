package com.rahul.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xbbl129 on 5/24/17.
 */
public class TripletSumTest {
    final TripletSum sum = new TripletSum();
    @Test
    public void tripletSum1() throws Exception {
        int[] input = {1, 1, 2, 5, 3};
        boolean rv = sum.tripletSum(8, input);
        assertEquals("Non matching return value", true, rv);

    }

    @Test
    public void tripletSum2() throws Exception {
        int[] input = {2,3,1};
        boolean rv = sum.tripletSum(6, input);
        assertEquals("Non matching return value", true, rv);
    }

    @Test
    public void tripletSum3() throws Exception {
        int[] input = {766, 768, 408, 678, 785, 705, 791, 835, 892, 622, 86, 735, 191, 543, 999, 87, 19, 622, 425, 598, 377, 255, 670, 109, 928, 494, 69, 367, 103, 439, 601, 820, 319, 291, 985, 340, 557, 809, 633, 479, 815, 788, 240, 75, 21, 828, 555, 989, 442, 799, 643, 3, 322, 105, 947, 57, 510, 834, 709, 762, 534, 687, 805, 386, 143, 843, 261, 162, 621, 344, 579, 188, 114, 64, 592, 935, 416, 657, 762, 13, 412, 960, 252, 739, 371, 125, 508, 8, 585, 952, 102, 490, 959, 442, 791, 14, 413, 856, 61, 94, 473, 403, 677, 544, 374, 267 };
        boolean rv = sum.tripletSum(413, input);
        assertEquals("Non matching return value", true, rv);
    }

}