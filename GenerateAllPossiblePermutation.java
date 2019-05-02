import java.util.Arrays;

/**
 * Generate all possible permutation of letters a given string.
 *
 * or an array
 */


/**
 * Where I strugged?
 *   > character arrays comparision must be '', if(chars[j]=='1'){ , not like if(chars[j]=1)...
 *   >
 *
 *
 */
public class GenerateAllPossiblePermutation {


    public static void main(String[] args) {
        int[] input = {1, 2, 3};


        int v = (int) Math.pow(2, input.length) - 1;
        for (int i = 1; i <=v ; i++) {
            String s = Integer.toBinaryString(i);

            char[] chars = prepareCharArray(s);
            StringBuffer sb = new StringBuffer();
            sb.append("{");
            for (int j = 0; j < input.length; j++) {
                if(chars[j]=='1'){
                    sb.append(input[j]);
                }
            }
            sb.append("}");
            System.out.println(sb.toString());

        }

    }

    private static char[] prepareCharArray(String s) {
        StringBuffer sb = new StringBuffer();

        char [] arra ;
        if(s.length()<3){
            int numberofZeros=3 - s.length();
           arra = new char[numberofZeros];
            sb.append(arra);
            Arrays.fill(arra, '0');
        }
       sb.append(s);
        return sb.toString().toCharArray();
    }

}
