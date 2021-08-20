package medium;

public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int calmCount = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                calmCount += customers[i];
                customers[i] = 0;
            }
        }

        int maxSavedCount = 0;
        for (int i = 0; i < minutes; i++) {
            maxSavedCount += customers[i];
        }
        int currentSavedCount = maxSavedCount;
        for (int i = minutes; i < customers.length; i++) {
            currentSavedCount += customers[i] - customers[i - minutes];
            if (currentSavedCount > maxSavedCount) {
                maxSavedCount = currentSavedCount;
            }
        }

        return calmCount + maxSavedCount;
    }
}
