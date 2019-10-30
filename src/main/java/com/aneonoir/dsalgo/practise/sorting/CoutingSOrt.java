package com.aneonoir.dsalgo.practise.sorting;

import java.util.stream.IntStream;



/*
NOTES:

        Counting sort :
        > all the values are discrete  non-negative
        > generally number
        > non-comparing algorithms
        >Values must in within a specific ranges, to be kwon in advance
        > not a in place algorithm
        > O(n), time complexity and o(n) for space
        > unstable, can you implement a stable one ?
*/

// mistake : counting[input[i]-1]++ instead of counting[input[i]-1]+1; as you are assining
// well you can simple do  counting[input[i]-1]++; instead of  counting[input[i]-1]=counting[input[i]-1]+1;
// mistake : I started with iterating input array instead of counting array in section `now traverse poplulate the input array with`
// forgetting to increament counter

// follow up
// can you do it given min and max is
// can you use -ve numbers for counting sort ?
// can you designed a stable sort , since its not stable ?

//


public class CoutingSOrt {

    public static void main(String ar[]) {
        int[] input = new int[]{4, 3, 2, 3, 1};
        int[] counting = new int[4];
        // traverse the input array and populate the countering array
        //[1,1,2,1]
        for (int i = 0; i < input.length; i++) {
            counting[input[i] - 1]++;//=counting[input[i]-1]+1;
        }

        //now traverse poplulate the input array with
        int inputIndex = 0;

        for (int countingIndex = 0; countingIndex < counting.length; countingIndex++) {
            int numberOf = counting[countingIndex];
            int value = countingIndex + 1;
            int counter = 0;
            while (counter++ < numberOf) {
                input[inputIndex++] = value;
            }

        }
        IntStream.of(input).forEach(System.out::println);
    }
}
