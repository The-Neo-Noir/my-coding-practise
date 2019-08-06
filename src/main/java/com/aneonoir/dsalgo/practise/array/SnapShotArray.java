package com.aneonoir.dsalgo.practise.array;

import java.util.Arrays;
import java.util.LinkedList;

public class SnapShotArray {

    private Integer holder[];
    private Integer snap = 0;
    private LinkedList<Integer[]> list;
    private int length = 0;

    public SnapShotArray(int length) {
        holder = new Integer[length];
        Arrays.fill(holder, 0);
        this.length = length;
        list = new LinkedList<>();
    }

    public static void main(String[] args) {
        SnapShotArray snapShotArray = new SnapShotArray(4);
        snapShotArray.snap();
        snapShotArray.snap();
        snapShotArray.get(3, 1);
        snapShotArray.set(2, 4);
        snapShotArray.snap();
        snapShotArray.set(1, 4);
    }

    public void set(int index, int val) {
        holder[index] = val;
    }

    public int snap() {

        snap++;
        list.add(holder);
        holder = new Integer[length];
        Arrays.fill(holder, 0);
        return snap - 1;
    }

    public int get(int index, int snap_id) {
        Integer[] current = list.get(snap_id);
        if (current != null) {
            return current[index];
        } else {
            return 0;
        }

    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
