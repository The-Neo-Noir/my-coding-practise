package com.aneonoir.dsalgo.practise.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * I did it in a super complecated way .
 *
 * It could have done in lot easier way .
 *
 * TODO: must do it ,
 *
 * tag: heap, sorting, interview, struggle.
 */
public class TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int sum = 0;
        while (true) {
            List<Integer> indexes = new ArrayList<>(n);
            int j = 0;
            for (int i = 0; indexes.size() < n && i < customers.length; i++) {
                if (customers[i] != 0) {
                    indexes.add(i);  //index out of bounds
                }
            }
            if (indexes.size() != 0) {
                System.out.println(indexes);
                if (indexes.size() == 1) {
                    sum += customers[indexes.get(0)];
                    customers[indexes.get(0)] = 0;
                    if (n != 1) break;
                } else {
                    int min = customers[indexes.get(0)];
                    for (int i = 1; i < indexes.size(); i++) {
                        if (customers[indexes.get(i)] < min) {
                            min = customers[indexes.get(i)];
                        }
                    }
                    for (int i = 0; i < indexes.size(); i++) {
                        customers[indexes.get(i)] = customers[indexes.get(i)] - min;
                    }
                    sum += min;
                }

            } else {
                break;
            }
        }
        return sum;
    }
}
