package medium;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = nums[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = product;
            product *= nums[i];
        }
        result[0] = 1;
        product = nums[nums.length - 1];
        for (int i = result.length - 2; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }
        return result;
    }
}
