package com.aneonoir.dsalgo.practise.strings;

import java.util.LinkedList;
import java.util.List;

/**
 * link:https://leetcode.com/problems/letter-case-permutation/submissions/
 *
 *
 * Initially I started with perm function which turns out to be wrong way ,
 * then I used binary way ,
 *
 * Mistake;  Integer.parseInt(0); 0;  <- only one character.
 * 								integer.parseInt(1); 10 ;
 *
 * 					  > if (bin.length() < letters) {
 *                 int binSize=letters - bin.length();
 *                 for (int count = 0; count < binSize; count++) bin = "0" + bin;
 *             }
 * 						instead of
 * 						 if (bin.length() < letters) {
 *                 for (int count = 0; count < letters - bin.length(; count++) bin = "0" + bin;
 *             }  // can you spot it. ??
 *
 * 								Super slow: Runtime: 86 ms, faster than 5.02% of Java online submissions for Letter Case Permutation.
 *
 *
 *
 * tag: interview, learning, trick, string,bitwise.
 *
 * TODO: slow performance , can you improve it.
 */
public class LetterCasePermutation {

    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        letterCasePermutation.letterCasePermutation("mQe");
    }

    public List<String> letterCasePermutation(String S) {
        int letters = 0;
        List<String> list = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            if (Character.isAlphabetic(S.charAt(i))) {
                letters++;
            }
        }
        System.out.println(letters);
        for (int i = 0; i < (int) Math.pow(2, letters); i++) {
            String bin = Integer.toBinaryString(i);
            if (bin.length() < letters) {
                int binSize=letters - bin.length();
                for (int count = 0; count < binSize; count++) bin = "0" + bin;
            }
            System.out.println(bin);
            StringBuffer sb = new StringBuffer();
            int binCount = 0;
            for (int j = 0; j < S.length(); j++) {
                if (Character.isAlphabetic(S.charAt(j))) {
                    if (bin.charAt(binCount) == '0') {
                        sb.append(S.charAt(j)); // append as is.
                    } else {
                        char charAt = ' ';
                        if (Character.isUpperCase(S.charAt(j))) {
                            charAt = (S.charAt(j) + "").toLowerCase().charAt(0);
                        } else {
                            charAt = (S.charAt(j) + "").toUpperCase().charAt(0);
                        }
                        sb.append(charAt + "");
                    }
                    binCount++;
                } else {
                    sb.append(S.charAt(j) + "");
                }
            }
            list.add(sb.toString());
        }

        return list;
    }
//       for(int i=0;i<S.length();i++){
//           if(Character.isAlphabetic(S.charAt(i))){
//               buildString(i,S,list);
//           }
//       }
//         return list;
//     }
//     private void buildString(int index, String s, List<String> list){
//         list.add(s);
//         String chars="";
//         if(Character.isUpperCase(s.charAt(index))){
//             chars=Character.toLowerCase(s.charAt(index))+"";
//         }else{
//           chars=Character.toUpperCase(s.charAt(index))+"";
//         }
//         String prefix=s.substring(0,index); //todo;
//         String postfix=s.substring(index+1,s.length());
//         list.add(prefix+chars+postfix);
//     }

}
