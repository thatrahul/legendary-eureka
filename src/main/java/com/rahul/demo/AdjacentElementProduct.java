package com.rahul.demo;

/**
 * Created by xbbl129 on 5/2/17.
 */
public class AdjacentElementProduct {

    int adjacentElementsProduct(int[] inputArray) {
        if (inputArray == null || inputArray.length <2 ) {
            throw new IllegalArgumentException("Bad input");
        }
        int index = 0;
        int currentProduct = inputArray[index] * inputArray[index+1];
        int maxProduct = currentProduct;
        for (int i = 1; i < inputArray.length-1; i++) {
            currentProduct = inputArray[i] * inputArray[i+1];
            if (maxProduct < currentProduct) {
                maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }

}
