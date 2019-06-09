package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/interview-practice/task/pMvymcahZ8dY4g75q
 */
public class FirstDuplicate {

    //Abhiram, you did it bad, you need to do it again
    int firstDuplicate(int[] a) {
        int b[] = new int[a.length + 1];
        int currentLeastIndex = -1;
        for (int counter = 0; counter < a.length; counter++) {

            if (b[a[counter]] == 0) {
                b[a[counter]] = a[counter];
            } else {
                if (currentLeastIndex == -1) {
                    currentLeastIndex = counter;
                }
                if (counter < currentLeastIndex) {
                    currentLeastIndex = counter;
                }
            }
        }
        if (currentLeastIndex != -1) {
            return a[currentLeastIndex];
        }
        return currentLeastIndex;
    }

}
