package com.rahul.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xbbl129 on 8/24/17.
 */
public class SortHeightTest {

    final SortHeight sorter = new SortHeight();

    @Test
    public void sortByHeight() throws Exception {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180 };
        a = sorter.sortByHeight(a);
        int[] sorted =  {-1, 150, 160, 170, -1, -1, 180, 190 };
        Assert.assertArrayEquals("doesn't match", sorted, a);
    }

    @Test
    public void sortByHeight2() throws Exception {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 0 };
        a = sorter.sortByHeight(a);
        int[] sorted =  {-1, 0, 150, 160, -1, -1, 170, 190 };
        Assert.assertArrayEquals("doesn't match", sorted, a);
    }

}