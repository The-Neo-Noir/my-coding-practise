package com.aneonoir.dsalgo.practise.array;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * link: https://www.hackerrank.com/challenges/sherlock-and-array/problem
 * <p>
 * struggle: no, but it still times out for large array
 * TODO:
 */
public class SherlockAndArray {


    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {

        String result = "NO";
        for (int i = 0; i < arr.size(); i++) {
            int leftSum = 0;
            int rightSum = 0;


            for (int left = i - 1; left >= 0; left--) {
                leftSum += arr.get(left);
            }

            for (int right = i + 1; right < arr.size(); right++) {
                rightSum += arr.get(right);
            }
            if (leftSum == rightSum) {
                result = "YES";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }


}
