package com.aneonoir.dsalgo.practise.math;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KthSmallestElementInMultiplicationTable {


    public static void main(String[] args) {

        KthSmallestElementInMultiplicationTable kthSmallestElementInMultiplicationTable = new KthSmallestElementInMultiplicationTable();
        int kthNumber = kthSmallestElementInMultiplicationTable.findKthNumber(2, 3, 5);
        System.out.println(kthNumber);

    }
    public int findKthNumber(int m, int n, int k) {
        int mx[][] = new int[m][n];
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < m; row++) {
                mx[row][col] = (col + 1) * (row + 1);
            }
        }
        Queue<Traid> que = new LinkedList<>();
        que.add(new Traid(0, 0, mx[0][0]));
        int low = 0;
        int result = 0;
        while (!que.isEmpty()) {
            List<Traid> list = new LinkedList<>();
            int high = 0;
            while (!que.isEmpty()) {
                list.add(que.remove());
                low++;

            }


            for (int i = 0; i < list.size(); i++) {
                Traid t = list.get(i);
                if (t.col + 1 < n) {
                    que.add(new Traid(t.row, t.col + 1, mx[t.row][t.col + 1]));
                    high++;
                }
                if (i == list.size() - 1) {
                    if (t.row + 1 < m) {
                        que.add(new Traid(t.row + 1, t.col, mx[t.row + 1][t.col]));
                        high++;
                    }
                }
            }
            if (k <= (low + high)) {
                List<Traid> s = new LinkedList<>(que);
                Collections.sort(s);
                result = s.get(k - low - 1).val;
                break;
            }
        }
        return result;
    }
}

class Traid implements Comparable<Traid> {

    int row;
    int col;
    int val;

    Traid(int row, int col, int val) {
        this.row = row;
        this.col = col;
        this.val = val;
    }

    @Override
    public int compareTo(Traid o) {
        return this.val - o.val;
    }
}
