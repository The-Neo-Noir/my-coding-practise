package com.aneonoir.dsalgo.practise.sorting;

/**
 * Notes:
 * > Makes assumption about data
 * > must have the same radix  and width. 123,432,543,229 good candidates, an binary number 1011,1111,1001 (width 4)
 * > data must be integers or strings but not floats.
 * > always starts at rightmost position
 * > Counting sort is often used as sort algorithm for radix sort. must be a stable couting sort.
 * > O(n) can achieve this becuase we are making assumptions about the data we are sorting.
 * > Even so , it often runs slower than O(nlogn) algorithms because of the overhead involed.
 * > inplace depends on which sort alrogithm we choose.
 * > Stable algorithm
 */
public class RadixSort {

}
