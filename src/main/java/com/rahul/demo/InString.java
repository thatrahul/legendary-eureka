package com.rahul.demo;

/**
 * Created by xbbl129 on 5/18/17.
 */
public class InString {

    int strstr1(String s, String x) {

        int slength = s.length();
        int xlength = x.length();
        int findex = 0;
        char[] schars = s.toCharArray();
        char[] fchars = x.toCharArray();

        if (slength < xlength) {
            return -1;
        }

        for (int sindex = 0; sindex < slength; sindex++) {
            char check = schars[sindex];
            if (check == fchars[findex]) {
                boolean found = true;
                for (int j = findex + 1; j < xlength && found; j++) {
                    found = (sindex + j < slength) && schars[sindex + j] == fchars[j];
                }
                if (found) {
                    return sindex;
                } else {
                    findex = 0;
                }
            }
        }
        return -1;
    }


    int strstr(String s, String x) {

        int slength = s.length();
        int xlength = x.length();
        int findex = 0;
        char[] schars = s.toCharArray();
        char[] fchars = x.toCharArray();

        if (slength < xlength) {
            return -1;
        }

        int sindex = 0;
        int xindex = 0;
        int matchPoint = -1;
        while (sindex < slength && xindex < xlength) {
            char schar = schars[sindex];
            char f = fchars[xindex];
            if (schar == f) {
                if (xindex == 0) {
                    matchPoint = sindex;
                }
                sindex++;
                xindex++;
            } else if (schar == fchars[0]) {

                //reset
                xindex = 1;
                matchPoint = sindex;
                sindex++;
            } else {
                sindex++;
                if (xindex > 0) {
                    xindex = 0;
                    matchPoint = -1;
                }
            }
        }
        return (xindex == xlength) ? matchPoint : -1;
    }

}



