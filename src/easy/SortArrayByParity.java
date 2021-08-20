package easy;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = nums.length - 1; i <= j;) {
            while (nums[i] % 2 == 0 && i < j) {
                i++;
            }
            while (nums[j] % 2 != 0 && i < j) {
                j--;
            }
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap;
            i++;
            j--;
        }
        return nums;
    }
}
