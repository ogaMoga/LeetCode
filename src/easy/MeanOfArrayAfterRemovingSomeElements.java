package easy;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum = 0;
        for(int i = arr.length / 20; i < arr.length - arr.length / 20; i++) {
            sum += arr[i];
        }
        return (sum * 10) / (arr.length * 9);
    }
}
