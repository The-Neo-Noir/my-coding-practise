package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-backwoods/uFQEiM4trARdm2z46
 *
 *
 */
public class DrawRectangle {

    @Test
    public void test() {
        char[][] chars = drawRectangle(new char[][]{
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
                {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}

        }, new int[]{1, 1, 4, 3});
        char[][] data= new char[][]{

                {'a','a','a','a','a','a','a','a'},
                {'a','*','-','-','*','a','a','a'},
                {'a','|','a','a','|','a','a','a'},
                {'b','*','-','-','*','b','b','b'},
                {'b','b','b','b','b','b','b','b'}
        };
        assertEquals(data,chars);
    }

    char[][] drawRectangle(char[][] canvas, int[] rectangle) {

        int leftCol=rectangle[0];
        int leftRow=rectangle[1];
        int endCol=rectangle[2];
        int endRow = rectangle[3];
        //left up to right up
        for (int i = leftCol; i <= endCol; i++) {
            if(i==leftCol || i==endCol) {
                canvas[leftRow][i] = '*';
                canvas[endRow][i] = '*';
            }else{
                canvas[leftRow][i] = '-';
                canvas[endRow][i] = '-';
            }
        }
        //left start to left end;
        for (int  i= leftRow;  i<=endRow ; i++) {

            if(i==leftRow || i==endRow) {
                canvas[i][leftCol] = '*';
                canvas[i][endCol] = '*';
            }else{
                canvas[i][leftCol] = '|';
                canvas[i][endCol] = '|';
            }
        }

        return canvas;
    }

}
