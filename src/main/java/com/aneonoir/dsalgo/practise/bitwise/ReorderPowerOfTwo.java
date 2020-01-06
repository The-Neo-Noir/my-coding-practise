package com.aneonoir.dsalgo.practise.bitwise;

import java.util.Arrays;

/**
 * Wow , an excellent question.
 *
 *
 * link: https://leetcode.com/problems/reordered-power-of-2/
 *
 * solved the commented approach, pretty bruteforce in nature, however really good. approach but slow, TLE 127/135
 *
 * Here is the idea,
 * I figured , i could check the last digit of the input to be 2, 4, 8, 6 then its a possible
 * 2 Raised power , other wise straight no, I used string to do , that,
 * In the next stage I have to generate all the permutation and I have to go through each
 * of the permutation and check if its power of 2.
 * Used this neat approach, count the digits present, int he
 *
 *  I had precomputed the the hashset with powers of 2 , and the retured true if one of the  permuted string can bring me result
 *  * > TLE: so , i removed the precomputed HashSet with simple bitmagic.
 *  * >
 *
 * tag: interview, bitwise, arrays, counting, trickey , tricky,note, learning
 *
 * TODO: analysis of the time complexity and space complexity .
 *
 *
 *
 *
 * Here is the idea,
 * I figured , i could check the last digit of the input to be 2, 4, 8, 6 then its a possible
 * 2 Raised power , other wise straight no, I used string to do , that,
 * In the next stage I have to generate all the permutation and I have to go through each
 * of the permutation and check if its power of 2.
 *
 * > I had precomputed the the hashset with powers of 2 , and the retured true if one of the  permuted string can bring me result
 * > TLE: so , i removed the precomputed HashSet with simple bitmagic.
 * >
 * I Understood the idea behind and optimied solution as provided.
 * Checkout a cool way of counting the number of digits. and
 */
public class ReorderPowerOfTwo {
    public boolean reorderedPowerOf2(int N) {
        int a[]= count(N);
        for(int i=0;i<31;i++){
            if(Arrays.equals(a,count(1<<i))){
                return true;
            }
        }
        return false;
    }

    public int[] count(int N) {
        int[] ans = new int[10];
        while (N > 0) {
            ans[N % 10]++;
            N /= 10;
        }
        return ans;
    }

    /** This approach timed out.
     public boolean reorderedPowerOf2(int N) {
     if(N==1) return true;
     String n=N+"";
     if(n.contains("2") || n.contains("4") || n.contains("8") || n.contains("6")){
     List<Long> longs = new LinkedList<>();
     stringBuild("",n,longs);

     boolean result=false;
     for(Long l: longs){
     if((l&(l-1))==0) { result=true; break;}
     }
     return result;
     }else{
     return false;
     }
     }
     private void stringBuild(String prefix, String num, List<Long> longs){
     if(num.equals("")){
     String last=prefix.charAt(prefix.length()-1)+"";
     if("2486".contains(last)){
     longs.add(Long.parseLong(prefix));
     }
     }else{
     for(int i=0;i<num.length();i++){
     String pr=prefix+num.charAt(i);
     String post=num.substring(0,i)+num.substring(i+1,num.length());
     stringBuild(pr,post,longs);
     }
     }
     }*/
}