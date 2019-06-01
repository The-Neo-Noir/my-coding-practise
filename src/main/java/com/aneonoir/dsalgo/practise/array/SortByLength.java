package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/sorting-outpost/QQB7f8ouAqY6jf7xi
 * <p>
 * I used bubble sort , as bubble sort is stable.
 */
public class SortByLength {

    String[] sortByLength(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - (i + 1); j++) {
                if (inputArray[j].length() > inputArray[j + 1].length()) {
                    String temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
        return inputArray;
    }

}
