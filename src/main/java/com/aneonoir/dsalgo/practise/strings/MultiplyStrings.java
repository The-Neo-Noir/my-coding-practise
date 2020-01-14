package com.aneonoir.dsalgo.practise.strings;

import java.util.LinkedList;

/**
 * 07/01/20  : mind is little fickle , I will do it today .
 *
 */
public class MultiplyStrings {
    public static void main(String[] args) {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        multiplyStrings.multiply("34", "34");
    }
        public String multiply(String num1, String num2) {
            LinkedList<String> rows= new LinkedList<>();
            int power2=0;
            for(int i=num2.length()-1;i>=0;i--){
                Integer out=Integer.parseInt(num2.charAt(i)+"");
                int remain=0;
                int number=0;
                int power=0;
                for(int j=num1.length()-1;j>=0;j--){
                    Integer in= Integer.parseInt(num1.charAt(j)+"");
                    Integer num= in*out+remain;
                    remain=num/10;
                    number=number+(num%10)*(int)Math.pow(10,power);
                    power++;
                }
                if(remain>0){
                    number=number+(remain%10)*(int)Math.pow(10,power);
                }
                number=number*(int)Math.pow(10,power2++);
                rows.add(number+"");
            }
            System.out.println(rows);
            int index=rows.get(rows.size()-1).length();

            StringBuffer sb = new StringBuffer();
            for (int i = index-1; i >=0; i--) {
                int number=0;
                int remainder=0;
//                for (String row : rows) {
//                    if(row.)
//                    number+=; // check outofbounds
//                }
            }

            return "";
        }

}
