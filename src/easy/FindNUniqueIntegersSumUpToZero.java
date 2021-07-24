package easy;

public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            result[(i - 1) * 2] = i;
            result[(i - 1) * 2 + 1] = - i;
        }
        if (n % 2 != 0) {
            result[n - 1] = 0;
        }
        return result;
    }
}
