package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/lab-of-transformations/QKnGhkoi4wKr6xY9b
 * <p>
 * TODO: is there any better way ?
 */

public class CharacterParity {

    String characterParity(char symbol) {
        String result = "";
        if ((symbol + "").matches("[02468]")) {
            result = "even";
        } else if ((symbol + "").matches("[13579]")) {
            result = "odd";
        } else {
            result = "not a digit";
        }
        return result;
    }
}
