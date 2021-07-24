package easy;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] countsFirst = new int[1001];

        for (int i : nums1) {
            countsFirst[i]++;
        }
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        for (int i : nums2) {
            if (countsFirst[i] > 0) {
                res[k] = i;
                k++;
                countsFirst[i] = 0;
            }
        }
        return Arrays.copyOf(res, k);
    }
}
