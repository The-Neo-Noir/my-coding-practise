package com.aneonoir.dsalgo.practise.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/2d-array/problem
 */
public class TwoDArrayDS {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        HourGlassDriver driver = new HourGlassDriver(arr);
        driver.parseAndBuild();
        System.out.println(driver.getWinner());

    }
}

class HourGlass {
    private int[][] internalStructure;

    private int hourGlassFigureSum;

    public HourGlass(int[][] arr) {

        this.internalStructure = arr;
        hourGlassSum();
    }

    public int getHourGlassFigureSum() {
        return hourGlassFigureSum;
    }

    private void hourGlassSum() {
        hourGlassFigureSum = rowSums(internalStructure[0]) + internalStructure[1][1] + rowSums(internalStructure[2]);
    }

    private int rowSums(int row[]) {
        int sum = 0;
        for (int count = 0; count < row.length; count++) {
            sum += row[count];
        }
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        return Arrays.deepEquals(this.internalStructure, ((HourGlass) obj).internalStructure);
    }

}

class HourGlassDriver {
    private HourGlass[] hourGlasses = new HourGlass[16];
    private int[][] sourceMatrix = new int[6][6];
    private int currentGlassCount = 0;

    public HourGlassDriver(int[][] data) {
        this.sourceMatrix = data;
    }

    private HourGlass createHourGlass(int sourceX, int row) {
        int[][] hourGlassStructure = new int[3][3];
        hourGlassStructure[0] = Arrays.copyOfRange(sourceMatrix[row], sourceX, sourceX + 3);
        hourGlassStructure[1] = Arrays.copyOfRange(sourceMatrix[row + 1], sourceX, sourceX + 3);
        hourGlassStructure[2] = Arrays.copyOfRange(sourceMatrix[row + 2], sourceX, sourceX + 3);
        return hourGlasses[currentGlassCount] = new HourGlass(hourGlassStructure);
    }

    public void parseAndBuild() {
        int hourGlassCount = 0;
        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {
                createHourGlass(col, row);
                currentGlassCount++;
            }
        }
    }

    public HourGlass[] getHourGlasses() {
        return hourGlasses;
    }


    public int getWinner() {
        int winner = hourGlasses[0].getHourGlassFigureSum();
        for (int counter = 1; counter < 16; counter++) {
            if (winner < hourGlasses[counter].getHourGlassFigureSum()) {
                winner = hourGlasses[counter].getHourGlassFigureSum();
            }
        }
        return winner;
    }
}
