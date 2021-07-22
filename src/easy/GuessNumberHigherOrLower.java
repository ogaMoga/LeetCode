package easy;

public class GuessNumberHigherOrLower {
        public static int guessNumber(int n) {
            int l = 1, r = n, m, result = 0;
            while (l < r) {
                m = l + ((r - l) >> 1);
//                int result = guess(m);    // mock for compiler
                switch (result) {
                    case 0:
                        return m;
                    case -1:
                        r = m - 1;
                        break;
                    case 1:
                        l = m + 1;
                        break;
                }
            }
            return l;
        }
}
