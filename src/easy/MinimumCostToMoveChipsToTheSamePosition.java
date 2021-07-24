package easy;

public class MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int countEven = 0;
        for (int j : position) {
            if (j % 2 == 0) {
                countEven++;
            }
        }
        return Math.min(countEven, position.length - countEven);
    }
}
