package medium;

public class ImplementRand10UsingRand7 {
    public int rand10() {
        int res = 0;
        for(int i = 0; i < 10; i++) {
            res += rand7();
        }
        res %= 10;
        return res == 0 ? 10 : res;
    }
}
