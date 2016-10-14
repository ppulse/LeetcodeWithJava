public class Solution {
    public int addDigits(int num) {
        int first = num / 1000000000 + num % 1000000000 / 100000000 +
                    num % 100000000 / 10000000 + num % 10000000 / 1000000 +
                    num % 1000000 / 100000 + num % 100000 / 10000 +
                    num % 10000 / 1000 + num % 1000 / 100 + num % 100 / 10 +
                    num % 10;
        int second = first / 10 + first % 10;
        int third = second / 10 + second % 10;
        return third;
    }
}