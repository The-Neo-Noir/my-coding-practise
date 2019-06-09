package com.aneonoir.dsalgo.practise.strings;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Link: https://app.codesignal.com/arcade/intro/level-4/ZCD7NQnED724bJtjN/
 * <p>
 * <p>
 * Task : Check how others are aproaching this problem.s
 */
public class StringDecoration {
    public static void main(String[] args) {
        System.out.println(addBorder(new String[]{"23", "23"}));

        System.out.println((int) (Math.log10(8) / Math.log10(2)));

    }

    static String[] addBorder(String[] picture) {
        String[] result = new String[picture.length + 2];
        int countMaxLength = countMax(picture);
        String preAndPostString = buildStingAstrics(countMaxLength + 2);
        result[0] = result[result.length - 1] = preAndPostString;
        int count = 1;
        for (int i = 0; i < picture.length; i++) {
            result[count] = "*" + picture[i] + buildStingAstrics((countMaxLength + 2) - (picture[i].length() + 1));
            count++;
        }
        return result;

    }

    static String buildStingAstrics(int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    static int countMax(String args[]) {
        Optional<String> max = Stream.of(args).max((o1, o2) -> Integer.valueOf(o1.length()).compareTo(o2.length()));
        return max.get().length();
    }

}
