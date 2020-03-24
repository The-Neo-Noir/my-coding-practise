package com.aneonoir.dsalgo.practise.java;

import java.util.LinkedList;

/**
 * link: https://leetcode.com/problems/rle-iterator/
 *
 *  approach: as know if we go with a traditional approach,building list and executing the next method
 *  we will end up in TLE.
 *
 *  With the approach below, I created a a custom list class,which will do the logic handling.
 *
 *
 *  tag: interview,must-do-interview, logic,iterator.
 *
 *
 * Runtime: 5 ms, faster than 99.29% of Java online submissions for RLE Iterator.
 * Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for RLE Iterator.
 *
 * TODO: can you do it without a object, some simple logic
 *
 */


class RLEIterator {
    Link root= null;
    Link prev=null;
    Link mptr=null;

    public RLEIterator(int[] A) {

        for(int i=0;i<A.length;i+=2){
            int limit=A[i];
            int val= A[i+1];
            if(limit!=0){
                Link cu= new Link(val,limit);
                if(root==null){
                    root=cu;
                    prev=cu;
                }else{
                    prev.next=cu;
                    prev=cu;
                }
            }
            mptr=root;
        }
    }

    public int next(int n) {
        if(mptr!=null){
            mptr=mptr.next(n,mptr);
            if(mptr==null)
                return -1;
            else
                return mptr.val;
        }else return -1;

    }
    class Link{
        int val;
        int limit;
        Link next;
        int ptr=-1;
        Link(int val, int limit){
            this.val=val;
            this.limit=limit;
        }
        public Link next(int n,Link mptr){
            if(ptr+n <= limit-1){
                ptr=ptr+n;
                return this;
            }else{
                if(this.next!=null){
                    mptr=this.next;

                    return mptr.next(ptr+n-(limit-1),mptr);
                }else{
                    return  null;
                }
            }
        }
    }
}


/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */
/** first approach timed out. We must redo

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
 */