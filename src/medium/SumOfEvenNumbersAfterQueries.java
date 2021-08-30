package medium;

public class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[nums.length];
        int sumEven = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int diff = queries[i][0];
            int index = queries[i][1];
            int oldValue = nums[index];

            if ((oldValue % 2 != 0) && (diff % 2 != 0)) {
                sumEven += oldValue + diff;
            } else if (oldValue % 2 == 0) {
                if (diff % 2 == 0) {
                    sumEven += diff;
                } else sumEven -= oldValue;
            }

            nums[index] += diff;
            result[i] = sumEven;
        }
        return result;
    }
}
