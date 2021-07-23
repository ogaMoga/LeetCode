package easy;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long l = 1, r = num >> 1;
        while (l <= r) {
            long m = l + ((r - l) >> 1);
            int compare = Long.compare(m * m, num);
            switch (compare) {
                case 0: {
                    return true;
                }
                case -1: {
                    l = m + 1;
                    break;
                }
                case 1: {
                    r = m - 1;
                    break;
                }
            }
        }
        return false;
    }
}
