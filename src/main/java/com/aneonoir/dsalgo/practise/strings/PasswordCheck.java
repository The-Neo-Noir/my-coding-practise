package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/challenge/BnqkJwW64dz5TNLax
 * <p>
 * appraoch: custom check , todo: using regex:
 * <p>
 * tag: regex,string,character.
 */
public class PasswordCheck {
    boolean passwordCheck(String inputString) {
        return
                isLegnthGreaterThanFive(inputString) && isRest(inputString);
    }

    boolean isLegnthGreaterThanFive(String input) {
        return input.length() >= 5;
    }

    boolean isRest(String input) {
        boolean lower = false;
        boolean capital = false;
        boolean digit = false;
        for (Character ch : input.toCharArray()) {
            if (Character.isDigit(ch) == true) digit = true;
            if (Character.isUpperCase(ch) == true) capital = true;
            if (Character.isLowerCase(ch) == true) lower = true;
        }
        return lower && capital && digit;
    }

}
