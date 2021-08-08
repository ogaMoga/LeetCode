package easy;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OccurrencesAfterBigram {
    public String[] findOccurrences(String text, String first, String second) {
        String[] split = text.split(" ");
        List<String> res = new ArrayList<>(split.length - 2);
        for (int i = 0; i < split.length - 2; i++) {
            if (split[i].equals(first) && split[i + 1].equals(second)) {
                res.add(split[i + 2]);
            }
        }
        return res.toArray(new String[]{});
    }
}
