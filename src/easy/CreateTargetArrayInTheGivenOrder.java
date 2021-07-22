package easy;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> resultList = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            resultList.add(index[i], nums[i]);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
