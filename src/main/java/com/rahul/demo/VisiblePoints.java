package com.rahul.demo;

/**
 * Created by xbbl129 on 5/19/17.
 * Points visible in 45 deg cone with vertex at 0,0
 * NOT COMPLETED.
 */
public class VisiblePoints {

    int visiblePoints(int[][] points) {

        int depth = points.length;
        int visible = 0;
        double[] angles = new double[depth];

        for (int point=0; point < depth; point++) {
            int x = points[point][0];
            int y = points[point][1];
            angles[point] = Math.atan(y/x);
            System.out.println("rejected x:" + x + " y:" + y + " tan: " + angles[point]);
//
//
//            if (x >= 0 && y >=0) {
//                double lowerY =  (double)2*x/3;
//                double upperY =  x*9;
//                if (lowerY <= y && y <= upperY) {
//                    visible++;
//                } else {
//                    System.out.println("rejected x:" + x + " y:" + y);
//                }
//            }
        }



        return visible;
    }







}
