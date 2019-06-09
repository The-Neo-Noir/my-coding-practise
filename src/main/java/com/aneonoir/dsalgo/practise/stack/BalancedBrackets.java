package com.aneonoir.dsalgo.practise.stack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * link: https://www.hackerrank.com/challenges/balanced-brackets/submissions/code/82875740?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
 */
public class BalancedBrackets {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        String balanced = "NO";
        Stack st = new Stack();
        char[] chars = s.toCharArray();
        for (char a : chars) {
            if (a == '{' || a == '(' || a == '[') {
                st.push(a);
            }
            if (a == ')' || a == ']' || a == '}') {
                if (st.empty()) {
                    balanced = "NO";
                    return balanced;
                } else {
                    char acur = (char) st.peek();
                    if (getClosing(acur) == a) {
                        st.pop();
                    } else {
                        balanced = "NO";
                        return balanced;

                    }
                }
            }
        }
        if (st.empty()) {
            balanced = "YES";
        }
        return balanced;

    }

    static char getClosing(char a) {
        if (a == '(') {
            return ')';
        } else if (a == '{') {
            return '}';
        } else {
            return ']';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
