package com.aneonoir.dsalgo.practise.lambda;
class Solution {
    public static int square(int x){
        Square sq= a->a*a;
        return sq.square(x);
    }
    public static boolean isEven(int num){
        EvenChecker nc= x-> x%2==0 ;
        return nc.test(num);
    }
}
@FunctionalInterface
interface Square{
    int square(int x);
}
@FunctionalInterface
interface EvenChecker{
    boolean test(int x);
}

class TestResult {
    public boolean succeeded;
    public String reason;
    public String input;
    public String expected_output;
    public String actual_output;

    @Override
    public String toString() {
        return "TestResult{" +
                "succeeded=" + succeeded +
                ", reason='" + reason + '\'' +
                ", input='" + input + '\'' +
                ", expected_output='" + expected_output + '\'' +
                ", actual_output='" + actual_output + '\'' +
                '}';
    }
}

public class EdsTestRunner {
    public static void main(String[] args) {
        TestResult[] testResults = executeTests();
        for (int i = 0; i < testResults.length; i++) {
            System.out.println(testResults[i]);
        }

    }
    public static TestResult[] executeTests() {
        int[] inputs = {0, 1, 2, 5};
        int[] expected_outputs = {0, 1, 4, 25};
        TestResult[] test_results = new TestResult[8];

        for(int i = 0; i < 4; i++) {
            test_results[i] = new TestResult();
            test_results[i].input = "square(" + inputs[i] + ")";
            test_results[i].expected_output = String.valueOf(expected_outputs[i]);

            int actual_output = Solution.square(inputs[i]);

            test_results[i].actual_output = String.valueOf(actual_output);

            if (actual_output == expected_outputs[i]) {
                test_results[i].reason = "Succeeded";
                test_results[i].succeeded = true;
            } else {
                test_results[i].reason = "Incorrect Output";
                test_results[i].succeeded = false;
            }
        }


        boolean[] expected_outputs2 = {true, false, true, false};


        for(int i = 4; i < test_results.length; i++) {
            test_results[i] = new TestResult();
            test_results[i].input = "isEven(" + inputs[i-4] + ")";
            test_results[i].expected_output = String.valueOf(expected_outputs2[i-4]);

            boolean actual_output2 = Solution.isEven(inputs[i-4]);

            test_results[i].actual_output = String.valueOf(actual_output2);

            if (actual_output2 == expected_outputs2[i-4]) {
                test_results[i].reason = "Succeeded";
                test_results[i].succeeded = true;
            } else {
                test_results[i].reason = "Incorrect Output";
                test_results[i].succeeded = false;
            }
        }
        return test_results;
    }
}