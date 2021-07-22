package easy;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        byte[] src = s.getBytes();
        int[] counts = new int[26];
        for (byte letter : src) {
            counts[letter - 'a']++;
        }
        for (int i = 0; i < src.length; i++) {
            if (counts[src[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
