package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 *
 I could able to think straight up for the solution.



 t\Learnings:
 > when comparing , make sure you use current with min or max to avoid mistakes
 for example salary[i]<min or something like salary[i] > max
 > when doing arithmatic expression make sure  you use brackets to deal with crazy outcomes.
 > Double results are crazy for example
 > [48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000] with output 41111.00000 , but expected is 41111.11111. Interestingly the division produced is with 00000 and by type casting to doubles solved it.
 > Another interesting observation :
 >
 Runtime: 10 ms, faster than 6.00% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.  for code

 public double average(int[] salary) {
 int sum=0;
 int min=salary[0],max=salary[0];
 for(int i=0;i<salary.length;i++){
 if(salary[i]<min){
 min=salary[i];
 }
 if(salary[i]>max){
 max=salary[i];
 }
 sum+=salary[i];
 }
 System.out.println(min+"  "+ max );
 return (double)(sum-(min+max))/(salary.length-2);
 }
 }
 But  for this code
 class Solution {
 public double average(int[] salary) {
 Arrays.sort(salary);
 double sum = 0;
 for(int i=1; i<salary.length-1; i++){
 sum += (double) salary[i];
 }
 return sum/(salary.length-2);
 }
 }
 Runtime: 10 ms, faster than 100% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.

 Did we not do a faster algo as o(n) but this o(n)+o(nlogn) is faster ?
 Learning is compiler and do some crazy optimization; thus just because o(n) is faster than o(n)+o(nlogn)

 tag: easy, array , sorting.
 */
public class AverageExcludingMinAndMax {
    public double average(int[] salary) {
        int sum=0;
        int min=salary[0],max=salary[0];
        for(int i=0;i<salary.length;i++){
            if(salary[i]<min){
                min=salary[i];
            }
            if(salary[i]>max){
                max=salary[i];
            }
            sum+=salary[i];
        }
        System.out.println(min+"  "+ max );
        return (double)(sum-(min+max))/(salary.length-2);
    }
}