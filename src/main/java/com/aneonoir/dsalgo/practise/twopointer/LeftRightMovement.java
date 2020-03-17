package com.aneonoir.dsalgo.practise.twopointer;

public class LeftRightMovement {
    public static void main(String[] args) {
        wheatFromChaff(new long[]{2, -4, 6, -6});
    }

    public static long[] wheatFromChaff(long[] values) {
        int low = 0;
        int high = values.length - 1;


//    - + low inc,dec
//    + - swap inc,dec
//    - - low inc, high stay
//    + + low stay, high dec
// -2, -37, -48, -47, 25, 41, 16
//    +{ 16, 25, -48, -47, -37, 41, -2 } + low stay, high dec

        while (low < high) {

            if (values[low] < 0) low++;
            if (values[high] > 0) high--;

            if (low < high && values[low] > 0 && values[high] < 0) {
                long temp = values[low];
                values[low] = values[high];
                values[high] = temp;
                low++;
                high--;
            }
        }
        return values;
    }
}
