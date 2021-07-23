package easy;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        for (int i = 0, j = 0; i < m || j < n;) {
            if (i == m) {
                while (j < n) {
                    result[i + j] = nums2[j];
                    j++;
                }
                break;
            }
            if (j == n) {
                while (i < m) {
                    result[i + j] = nums1[i];
                    i++;
                }
                break;
            }
            if (nums1[i] < nums2[j]) {
                result[i + j] = nums1[i];
                i++;
            } else {
                result[i + j] = nums2[j];
                j++;
            }
        }
        System.arraycopy(result, 0, nums1, 0, nums1.length);
    }
}
