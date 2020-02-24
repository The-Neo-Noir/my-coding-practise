package com.aneonoir.dsalgo.practise.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * link: https://leetcode.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/
 *
 * easy questions;
 *
 * TODO: can you do it using streams ?
 *
 *
 * tag: sorting, multikey sorting,interview, easy
 * 
 */
public class FilterRestaurants {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

        List<Wrap> wrappedList = new ArrayList<>();
        for (int row = 0; row < restaurants.length; row++) {
            int id = restaurants[row][0];
            int rating = restaurants[row][1];
            int vegan = restaurants[row][2];
            int price = restaurants[row][3];
            int dis = restaurants[row][4];
            if (vegan >= veganFriendly && price <= maxPrice && dis <= maxDistance) {
                wrappedList.add(new Wrap(rating, id));
            }

        }
        Collections.sort(wrappedList);
        List<Integer> result = new ArrayList<>(wrappedList.size());
        for (Wrap item : wrappedList) {
            result.add(item.id);
        }
        return result;
    }
}

class Wrap implements Comparable<Wrap> {
    int rating;
    int id;

    Wrap(int rating, int id) {
        this.rating = rating;
        this.id = id;
    }

    public int compareTo(Wrap obj) {
        if (obj.rating - this.rating == 0) {
            return obj.id - this.id;
        } else {
            return obj.rating - this.rating;
        }
    }
}
