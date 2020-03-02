package com.aneonoir.dsalgo.practise.java;

import java.util.LinkedList;

/**
 * unfisnihed code from leetcode
 */
public class RLEIterator {
    public static void main(String[] args) {
        RLEIterator rleIterator = new RLEIterator(new int[]{3, 8, 2, 5});
        int next = rleIterator.next(3);
        int s = rleIterator.next(3);


    }
    class Wrap {
        int num;
        int times;

        Wrap(int num, int times) {
            this.num = num;
            this.times = times;
        }
    }

    LinkedList<Wrap> holder = new LinkedList<>();
    int keyLoc = -1;
    int valLoc = 0;

    public RLEIterator(int[] A) {
        boolean isFirst = true;
        for (int i = 0; i < A.length; i += 2) {
            int times = A[i];
            int num = A[i + 1];
            if (times != 0) {
                holder.add(new Wrap(num, times));
            }
        }
        if (holder.size() > 0) {
            keyLoc = 0;
            // valLoc=holder.get(keyLoc).times;
        }
    }

    // [8,8,8,5,5]
    public int next(int n) {
        if (keyLoc < 0) {
            return -1;
        } else {
            if (keyLoc < holder.size()) {
                int times = holder.get(keyLoc).times;
                while (n + valLoc > times) {
                    n = (valLoc + n) - times;
                    if (keyLoc + 1 < holder.size()) {
                        times = holder.get(keyLoc++).times;
                        valLoc = 0;
                    } else {
                        keyLoc = -1;
                        return -1;
                    }
                }
                int number = holder.get(keyLoc).num;
                valLoc = valLoc + n;
                return number;
            } else {
                keyLoc = -1;
                return -1;
            }

        }
    }
}