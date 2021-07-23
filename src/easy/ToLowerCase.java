package easy;

public class ToLowerCase {
    public String toLowerCase(String s) {   //  yes I know about string.toLowerCase()
        byte[] src = s.getBytes();
        for (int i = 0; i < s.length(); i++) {
            if (src[i] >= 'A' && src[i] <= 'Z') {
                src[i] = (byte) (src[i] - 'A' + 'a');
            }
        }
        return new String(src);
    }
}
