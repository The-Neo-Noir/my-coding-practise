package com.aneonoir.dsalgo.practise.strings;

public class DecodeString {
    public static void main(String[] args) {
        String s = decodeString("3[a]2[b4[F]c]");

        System.out.println(s);
    }

    private static String decodeString(String str) {
        if(!str.contains("[")){
            return str;
        }else{
            //"3[bsdfs]2[e3[sdf]sd";
            StringBuffer pre= new StringBuffer();
            String post = new String();
            String pro="";
            int operator=0;
            boolean prefixEnd=false;
            int index=0;
            for (Character ch : str.toCharArray()) {
                if (Character.isAlphabetic(ch)) {
                    if(prefixEnd==false) {
                        pre.append(ch);
                    }
                } else if (Character.isDigit(ch)) {
                    operator = operator * 10 + Integer.parseInt(ch + "");
                    prefixEnd=true;
                } else if(ch=='[') {
                    pro = str.substring(index + 1, str.indexOf("]", index + 1)+1);
                    if(!pro.contains("[")) pro = pro.substring(0, pro.length() - 1);
                    post = str.substring(str.indexOf("]", index + 1) + 1, str.length());
                    if(post.length()>1 && post.charAt(post.length()-1)==']' && !post.contains("[")) post = post.substring(0, post.length() - 1);
                    break;
                }
                index++;
            }
            String finals = pre.toString();
            String res="";
            if(pro.length()>=1){
                res = buildStr(decodeString(pro), operator);
            }
            finals+=res;
            String postRes="";
            if((post.length()>=1)){
                postRes = decodeString(post);
            }
            finals+=postRes;
            return finals;
        }
    }

    private static String buildStr(String decodeString, int operator) {
        StringBuilder sb = new StringBuilder();
        while(operator-->0){
            sb.append(decodeString);
        }
        return sb.toString();
    }
}
