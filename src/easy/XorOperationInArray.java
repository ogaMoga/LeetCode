package easy;

public class XorOperationInArray {
    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^= 2 * i + start;
        }
        return result;
    }
}
