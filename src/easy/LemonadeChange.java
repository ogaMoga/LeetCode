package easy;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5: {
                    fiveCount++;
                    break;
                }
                case 10: {
                    if (fiveCount == 0) {
                        return false;
                    }
                    fiveCount--;
                    tenCount++;
                    break;
                }
                case 20: {
                    if (tenCount > 0 && fiveCount > 0) {
                        fiveCount--;
                        tenCount--;
                    } else if (fiveCount >= 3) {
                        fiveCount -= 3;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
