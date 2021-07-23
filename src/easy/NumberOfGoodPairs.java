package easy;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];
        for (int num : nums) {
            counts[num]++;
        }
        int result = 0;
        for (int count : counts) {
            if (count > 1) {
                result += count * (count - 1) / 2;
            }
        }
        return result;
    }
}
