package com.aneonoir.dsalgo.practise.math;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class EasyLine {
    public static void main(String[] args) {

    System.out.println((char)97);
    }
    public static BigInteger easyLine(int n) {

        List<List<BigInteger>> big = new LinkedList<>();
        List<BigInteger> list = new LinkedList<>();
        list.add(new BigInteger("1"));

        List<BigInteger> row2 = new LinkedList<>();
        list.add(new BigInteger("1"));
        list.add(new BigInteger("1"));

        big.add(list);
        big.add(row2);
        for (int i = 2; i <= n; i++) {
            List<BigInteger> l = new LinkedList<>();
            l.add(new BigInteger("1"));
            List<BigInteger> lastRow = big.get(i - 1);
            for (int row = 0; row < lastRow.size() - 1; row++) {
                l.add(lastRow.get(row).add(lastRow.get(row + 1)));
            }
            l.add(new BigInteger("1"));
        }

        BigInteger result = new BigInteger("1");
        List<BigInteger> rowResult = big.get(n);
        for (int i = 1; i < rowResult.size(); i++) {
            result = result.add(
                    new BigInteger(rowResult.get(i).toString(10))
                            .multiply(new BigInteger(rowResult.get(i).toString(10)))
            );

        }
        result = result.add(new BigInteger("1"));
        return result;
    }
}
