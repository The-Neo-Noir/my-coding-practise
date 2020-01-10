package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * https://app.codesignal.com/arcade/code-arcade/spring-of-integration/dwA8RtDF86WucuoaQ
 * <p>
 * Struggle: convertIntArrayToList , i++ is the problem , it should be i+
 *
 * TODO: can you do it without using all those arraylist and stuff  , i.e inplace  ?
 *
 * {@link ArrayConversionII}
 *
 */
public class ArrayConversion {

    @Test
    public void test() {
        assertEquals(186, arrayConversion(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        // assertEquals(186, arrayConversion(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println("http://tinyurl.com/4e9iAk".substring("http://tinyurl.com/4e9iAk".lastIndexOf("/") + 1));

    }

    int arrayConversion(int[] inputArray) {

        int iteration = (int) (Math.log10(inputArray.length) / Math.log10(2));
        int counter = 1;

        ArrayList<Integer> local = local = convertIntArrayToList(inputArray);
        while (counter <= iteration) {


            if (counter % 2 == 1) { //first iteration, odd
                local = additionCalculation(local);
            } else { // second iteration, even
                local = multiplicationCalculation(local);
            }
            counter++;
        }
        return local.get(0).intValue();
    }

    ArrayList<Integer> convertIntArrayToList(int[] input) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {

            resultList.add(input[i]);
        }
        return resultList;
    }

    ArrayList<Integer> additionCalculation(ArrayList<Integer> input) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < input.size() - 1; i += 2) {
            al.add(input.get(i) + input.get(i + 1));
        }
        return al;
    }

    ArrayList<Integer> multiplicationCalculation(ArrayList<Integer> input) {

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < input.size() - 1; i += 2) {
            al.add(input.get(i) * input.get(i + 1));
        }
        return al;
    }

}
