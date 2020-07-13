package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
 *  approach: range checking of querytime falling in the starttime and endtime of every children.
 *
 *  tag: easy , range checking,
 */
public class NumberOfStudentsDoingHomeWorkAtAGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime  && endTime[i]>=queryTime) count++;
        }
        return count;
    }
}
