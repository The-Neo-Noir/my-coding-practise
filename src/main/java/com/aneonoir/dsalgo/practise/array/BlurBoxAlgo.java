package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * link: https://app.codesignal.com/arcade/intro/level-5/5xPitc3yT3dqS7XkP
 * solution:
 *          A classic bruteforce, people get this wrong most of the time, no trick,
 *          just plain old programming
 * Struggle: abhiram you get the rows and columns wrong, instead of making the for loop
 *          variables are i or j make them row or columns
 *
 *          tips: array.legth ; will give you the rows it has
 *                array[0].length ; will give you the columns it has
 *
 * TODO: Do it again , see if you can solve it in under 10 mins
 *
 * DOit again, unsolved
 *
 */
public class BlurBoxAlgo {

    @Test
    public void test() {
        int input[][] =
                {{7, 4, 0, 1},
                 {5, 6, 2, 2},
                {6, 10, 7, 8},
                {1, 4, 2, 0 }};

        int[][] ints = boxBlur(input);
        System.out.println();
    }

    int[][] boxBlur(int[][] image) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer>  rowList = new ArrayList<>();

        list.add(rowList);
        for (int column = 0; column <= image[0].length - 3 ; column++) {
            for (int row = 0; row <= image.length - 3; row++) {

                int temp = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp += image[i+row][j + column];
                    }
                }

                list.get(column).add(temp / 9);
            }
        }
        int as[][] = new int[list.size()][list.get(0).size()];
        System.out.println(list);
        int row=0;
        int column=0;
        for(List<Integer> rowListr: list){
            for (Integer columnItem : rowListr) {
                as[row][column]=columnItem;
                column++;
            }
            column=0; /// YOU forgot this
            row++;
        }
         return as;
    }

}
