package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/goat-latin/
 * <p>
 * struggle: how I wanted to deal with the spaces in between the words, I started with spliting the setence
 * by \\s+ and then finding the words , but then I had to deal with the spaces , which I struggelded
 * <p>
 * Task: TODO: Can you do it without sp         v v v vvvbgh v          bvb litting the word
 * <p>
 * <p>
 * <p>
 * update: solved it, my earlier assumption was wrong, there is only a single space between the words.
 *
 * solved , but the runtime can be improved.
 *
 * Runtime: 6 ms, faster than 15.90% of Java online submissions for Goat Latin.
 * Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Goat Latin.
 *
 *
 * Task: how would you do it if you were to assume there are more than one spaces inbetween the words.
 *
 * TODO: can you do it functional way ? ? YOUTUBE: video
 */
public class GoatLatin {

    public String toGoatLatin(String inputSetence) {
        String inputs[] = inputSetence.split("\\W");
        StringBuffer sb = new StringBuffer();
        int index = 1;
        for (String input : inputs) {
            if (startsWithVowel(input)) {
                sb.append(input).append(buildMa(index));
            } else {
                sb.append(consonant(input)).append(buildMa(index));
            }
            sb.append(" ");
            index++;
        }
        return sb.toString().trim();
    }

    private boolean startsWithVowel(String input) {
        char in = input.toLowerCase().charAt(0);
        return in == 'a' ||
                in == 'e' ||
                in == 'i' ||
                in == 'o' ||
                in == 'u';

    }

    private String consonant(String input) {
        return input.substring(1) + "" + input.charAt(0);
    }

    private String buildMa(int number) {
        StringBuffer sb = new StringBuffer("ma");
        for (int i = 0; i < number; i++) {
            sb.append("a");
        }
        return sb.toString();
    }


/*


    private static String buildMa(int i) {
        StringBuffer sb = new StringBuffer("ma");
        for (int j = 0; j < i; j++) {
            sb.append("a");
        }
        return sb.toString();
    }

    private static String manipulateConsonants(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.replace(0, word.length() - 1, sb.substring(1, word.length()))
                .replace(word.length() - 1, word.length(), word.charAt(0) + "");
        return sb.toString();
    }

    private static boolean startsWithVowelIgnoreCase(String inputString) {
        final String input = inputString.toLowerCase();
        return input.startsWith("a") || input.startsWith("e") || input.startsWith("i") || input.startsWith("o") || input.startsWith("u");
    }

    @Test
    public void testIfVowels() {
        String input = "apple";
        String input2 = "opple";
        String input3 = "Epple";
        String input4 = "ipple";
        String input5 = "upple";

        assertTrue(startsWithVowelIgnoreCase(input));
        assertTrue(startsWithVowelIgnoreCase(input2));
        assertTrue(startsWithVowelIgnoreCase(input3));
        assertTrue(startsWithVowelIgnoreCase(input4));
        assertTrue(startsWithVowelIgnoreCase(input5));
    }

    @Test
    public void testConsonents() {

        String input6 = "Tpple";
        String input7 = "spple";

        assertFalse(startsWithVowelIgnoreCase(input6));
        assertFalse(startsWithVowelIgnoreCase(input7));

    }

    @Test
    public void testBuildConsonents() {
        String inputWord = "vinegar";
        assertEquals("inegarv", manipulateConsonants(inputWord));

    }

    @Test
    public void name() {
        String inputSetence = "Apple Vinegar  ";
        String sb = buildGoatLanguage(inputSetence);

        assertEquals("Applemaa inegarVmaaa  ", sb);

        inputSetence = "RFd FvQoab d";
        String sb2 = buildGoatLanguage(inputSetence);

        assertEquals("FdRmaa vQoabFmaaa dmaaaa", sb2);

    }

    private String buildGoatLanguage(String inputSetence) {
        String[] words = inputSetence.split("\\s+");
        StringBuffer sb = new StringBuffer();
        int currentIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (startsWithVowelIgnoreCase(words[i])) {
                String s = captureSpaces(inputSetence, words[i]);
                sb.append(words[i])
                        .append(buildMa(i + 1))
                        .append(s);
            } else {
                String s = captureSpaces(inputSetence, words[i]);
                sb.append(new StringBuffer(manipulateConsonants(words[i])))
                        .append(buildMa(i + 1))
                        .append(s);

            }
        }
        return sb.toString();
    }

    @Test
    public void testCaptureSpace() {
        String input = "apple  cider";
        assertEquals("  ", captureSpaces(input, "apple"));
        assertEquals("", captureSpaces(input, "cider"));


        String input2 = "apple    cider";
        assertEquals("    ", captureSpaces(input2, "apple"));
        assertEquals("", captureSpaces(input2, "cider"));


        String input3 = "apple  cider   ";
        assertEquals("  ", captureSpaces(input3, "apple"));
        assertEquals("   ", captureSpaces(input3, "cider"));


        String input4 = "apple cider";
        assertEquals(" ", captureSpaces(input4, "apple"));
        assertEquals("", captureSpaces(input4, "cider"));

        String input5 = "RFd FvQoab d";


        assertEquals("", captureSpaces(input4, "d"));


    }

    private String captureSpaces(String inputSetence, String word) {
        StringBuffer sb = new StringBuffer();
        int i1 = inputSetence.indexOf(word);
        if (i1 > 0) {
            i1 = i1;
        } else {
            i1 = 0;
        }
        int index = word.length() + i1;
        while (index < inputSetence.length() && true) {

            if (inputSetence.charAt(index) == ' ') {
                sb.append(' ');
                index++;
            } else {
                break;
            }
        }
        System.out.println(i1);
        return sb.toString();
    }

    @Test
    public void testBUildMaaString() {
        String s = buildMa(1);
        String s1 = buildMa(2);
        assertEquals("maa", s);
        assertEquals("maaa", s1);
    }
*/
}