package medium;

public class MinimumFlipsToMakeAOrBEqualToC {
    public int minFlips(int a, int b, int c) {
        int or = a | b;
        int xor = a ^ b;
        int result = 0;
        while (or > 0 || c > 0) {
            int orBit = or % 2;
            int cBit = c % 2;
            int xorBit = xor % 2;
            or /= 2;
            c /= 2;
            xor /= 2;
            if (orBit == 0 && cBit == 1) {
                result++;
            } else if (orBit == 1 && cBit == 0) {
                if (xorBit == 1) {
                    result++;
                } else {
                    result += 2;
                }
            }
        }
        return result;
    }
}
