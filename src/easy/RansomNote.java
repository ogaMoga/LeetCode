package easy;

import java.nio.charset.StandardCharsets;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (byte b : magazine.getBytes()) {
            count[b - 'a']++;
        }
        for (byte b : ransomNote.getBytes()) {
            int index = b - 'a';
            count[index]--;
            if (count[index] < 0) {
                return false;
            }
        }
        return true;
    }
}
