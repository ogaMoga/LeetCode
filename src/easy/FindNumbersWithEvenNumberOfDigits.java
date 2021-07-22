package easy;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if ((num >= 10) && (num <= 99)
                    || (num >= 1000) && (num <= 9999) || (num == 100000)) {
                res++;
            }
        }
        return res;
    }
}
