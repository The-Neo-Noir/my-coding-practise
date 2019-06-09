package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

/**
 * link: https://app.codesignal.com/arcade/intro/level-11/pwRLrkrNpnsbgMndb
 * <p>
 * Struggle: yes, but can I find a better way to solve it
 */
public class ChessNight {

    @Test
    public void test() {
        int a1 = chessKnight("c2");

    }

    int chessKnight(String cell) {
        String asd[] = new String[8];
        asd[0] = ((char) (cell.charAt(0) + 1)) + "" + (Integer.parseInt(cell.charAt(1) + "") + 2) + "";
        asd[1] = ((char) (cell.charAt(0) - 1)) + "" + (Integer.parseInt(cell.charAt(1) + "") + 2) + "";
        asd[2] = ((char) (cell.charAt(0) + 1)) + "" + (Integer.parseInt(cell.charAt(1) + "") - 2) + "";
        asd[3] = ((char) (cell.charAt(0) - 1)) + "" + (Integer.parseInt(cell.charAt(1) + "") - 2) + "";

        asd[4] = ((char) (cell.charAt(0) - 2)) + "" + (Integer.parseInt(cell.charAt(1) + "") + 1) + "";
        asd[5] = ((char) (cell.charAt(0) - 2)) + "" + (Integer.parseInt(cell.charAt(1) + "") - 1) + "";
        asd[6] = ((char) (cell.charAt(0) + 2)) + "" + (Integer.parseInt(cell.charAt(1) + "") + 1) + "";
        asd[7] = ((char) (cell.charAt(0) + 2)) + "" + (Integer.parseInt(cell.charAt(1) + "") - 1) + "";
        int counter = 0;
        for (int i = 0; i < 8; i++) {
            if (asd[i].matches("[a-h][1-8]")) {
                counter++;
            }

        }
        return counter;
    }

}
