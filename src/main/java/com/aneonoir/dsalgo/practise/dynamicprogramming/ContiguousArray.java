package com.aneonoir.dsalgo.practise.dynamicprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContiguousArray {
    public static void main(String[] args) {
        ContiguousArray contiguousArray = new ContiguousArray();
        int maxLength = contiguousArray.findMaxLength(new int[]{0,0,1,0,1,1,1,1});
      //  int maxLength = contiguousArray.findMaxLength(new int[]{0,1,0,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,0,1,1,0,0,0,1,1});
        System.out.println(maxLength);

    }

    public int findMaxLength(int[] nums) {
        int best = 0;
        int zc = 0;
        int oc = 0;
        for (Integer in : nums) {
            if (in == 0) zc++;
            if (in == 1) oc++;
        }
        HashMap<Key,Integer> set = new HashMap<>();

        return find(nums, 0, nums.length - 1, zc, oc, set);
    }

    class Key {
        int low;
        int high;

        Key(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Key key = (Key) o;

            if (low != key.low) return false;
            return high == key.high;
        }

        @Override
        public int hashCode() {
            int result = low;
            result = 31 * result + high;
            return result;
        }
    }

    private int find(int nums[], int low, int high, int zc, int oc,  HashMap<Key,Integer> keyHashSet) {
        if (low < high) {
            int lown = nums[low];
            int zcl = zc;
            int ocl = oc;
            if (lown == 0) {
                zcl = zc - 1;
            } else {
                ocl = oc - 1;
            }
            int hown = nums[high];
            int zch = zc;
            int och = oc;
            if (hown == 0) {
                zch = zc - 1;
            } else {
                och = oc - 1;
            }

            Key key = new Key(low, high);
            if(zc==0 || oc==0) {keyHashSet.put(key, 0);return 0;}
            System.out.println(low+""+ high);
            if (zc == oc) {
                int i = high - low + 1;
                keyHashSet.put(key, i);
                return i;
            } else {

                if (keyHashSet.containsKey(key)) {
                    System.out.println("hit ");
                    return keyHashSet.get(key);
                } else {

                    int b = find(nums, low, high - 1, zch, och, keyHashSet);
                    int a = find(nums, low + 1, high, zcl, ocl, keyHashSet);
                    int max = Math.max(a, b);
                 //   Key key = new Key(low, high);
                    keyHashSet.put(key, max);
                    return max;
                }
            }
        } else {
            return 0;
        }
    }
}
