package medium;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right){
        while(left < right){
            int swap = nums[right];
            nums[right] = nums[left];
            nums[left] = swap;
            left++;
            right--;
        }
    }
}
