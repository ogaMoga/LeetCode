package easy;

public class SortArrayByParity2 {
    public static int[] sortArrayByParity2(int[] nums) {
        for (int i = 0, j = 1; i < nums.length && j < nums.length;) {
            while ((i < nums.length) && (nums[i] % 2 == 0)) {
                i += 2;
            }
            while ((j < nums.length) && (nums[j] % 2 != 0)) {
                j += 2;
            }
            if (i >= nums.length || j >= nums.length) {
                continue;
            }
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap;
            i += 2;
            j += 2;
        }
        return nums;
    }
}
