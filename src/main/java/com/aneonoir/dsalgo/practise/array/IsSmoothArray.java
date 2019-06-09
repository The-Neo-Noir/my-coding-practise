package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-forest-edge/3LmZafR9wMCWpdgra
 */
public class IsSmoothArray {
    boolean isSmooth(int[] arr) {
        int middle = arr.length % 2 == 0 ? arr[arr.length / 2] + arr[(arr.length / 2) - 1] : arr[arr.length / 2];
        return arr[0] == arr[arr.length - 1] && arr[0] == middle;

    }
}
