package easy;

public class MinStartValue {
    public int minStartValue(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum < minSum) {
                minSum = sum;
            }
        }
        return minSum < 0 ? 1 - minSum : 1;
    }
}
