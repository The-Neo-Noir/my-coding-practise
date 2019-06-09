import java.util.Scanner;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        StringBuffer output = new StringBuffer("");
        for (int count = arr.length - 1; count >= 0; count--) {
            output.append(arr[count] + " ");
        }
        System.out.println(output.toString());
    }
}