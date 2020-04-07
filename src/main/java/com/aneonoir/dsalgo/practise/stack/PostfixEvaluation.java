package com.aneonoir.dsalgo.practise.stack;

public class PostfixEvaluation {

    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();*/
        System.out.println(result("23+9-"));
        // }
    }

    public static int result(String str) {

        if (str.length() == 1) {
            return Integer.parseInt(str);
        } else {
            int i = 0;
            boolean flag = false;
            String nex = "";
            while (i < str.length()) {
                Integer result = 0;
                String ab = "";
                switch (str.charAt(i)) {
                    case '+':
                        ab = str.substring(i - 2, i);
                        result = add(ab);
                        flag = true;
                        break;
                    case '-':
                        ab = str.substring(i - 2, i);
                        result = subtract(ab);
                        flag = true;
                        break;
                    case '*':
                        ab = str.substring(i - 2, i);
                        result = multply(ab);
                        flag = true;
                        break;
                    case '/':
                        ab = str.substring(i - 2, i);
                        result = devide(ab);
                        flag = true;
                        break;
                    default:
                        break;
                }

                if (flag) {
                    nex = str.substring(0, i - 2) + result + str.substring(i + 1);
                    break;
                }
                i++;
            }
            return result(nex);
        }

    }

    private static Integer devide(String ab) {
        return Integer.parseInt(ab.charAt(0) + "") / Integer.parseInt(ab.charAt(1) + "");
    }

    private static Integer multply(String ab) {
        return Integer.parseInt(ab.charAt(0) + "") * Integer.parseInt(ab.charAt(1) + "");
    }

    private static Integer subtract(String ab) {
        return Integer.parseInt(ab.charAt(0) + "") - Integer.parseInt(ab.charAt(1) + "");
    }

    private static int add(String ab) {
        return Integer.parseInt(ab.charAt(0) + "") + Integer.parseInt(ab.charAt(1) + "");
    }
}
