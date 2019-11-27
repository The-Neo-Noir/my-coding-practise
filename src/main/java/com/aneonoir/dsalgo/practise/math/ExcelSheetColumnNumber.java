package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/excel-sheet-column-number
 * <p>
 * <p>
 * approach: simple magic
 * <p>
 * Note: A ascii code 65
 * Z asci code 65+25=90
 * <p>
 * tag: interview, match, character , string.
 * <p>
 * TOOD: do recursively .
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int length = s.length() - 1;
        int result = 0;
        int i = 0;
        while (length >= 0) {
            result += ((int) Math.pow(26, length) * (((int) s.charAt(i) % 65) + 1));
            i++;
            length--;
        }
        return result;
    }
}
