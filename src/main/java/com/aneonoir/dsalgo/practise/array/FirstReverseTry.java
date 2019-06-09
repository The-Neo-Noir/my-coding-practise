package com.aneonoir.dsalgo.practise.array;

/**
 * https://app.codesignal.com/arcade/code-arcade/list-forest-edge/ND8nghbndTNKPP4Tb/solutions
 */
public class FirstReverseTry {

    int[] firstReverseTry(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr;
        int temp = arr[0];
        arr[0] = arr[(arr.length - 1)];
        arr[(arr.length - 1)] = temp;

        return arr;
    }

}
