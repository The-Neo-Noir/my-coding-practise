//Write your code here
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class MyCalculator implements AdvancedArithmetic {
7

    public int divisor_sum(int n) {
        8
        int sum = 0;
        9
        for (int i = 1; i <= n; i++) {
            10
            if (n % i == 0) {
                11
                sum += i;
                12
            }
            13
        }
        14
        return sum;
        15
    }
16
}
