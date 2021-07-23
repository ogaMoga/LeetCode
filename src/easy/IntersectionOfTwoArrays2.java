package easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] countsFirst = new int[1001];
        int[] countsSecond = new int[1001];

        for (int i : nums1) {
            countsFirst[i]++;
        }
        for (int i : nums2) {
            countsSecond[i]++;
        }
        List<Integer> result = new ArrayList<>(Math.min(nums1.length, nums2.length));
        for (int i = 0; i < countsFirst.length; i++) {
            int res =  Math.min(countsFirst[i], countsSecond[i]);
            for (int j = 0; j < res; j++) {
                result.add(i);
            }
        }
        int[] intRes = new int[result.size()];
        for (int i = 0; i < intRes.length; i++)
        {
            intRes[i] = result.get(i);
        }
        return intRes;
    }
}
