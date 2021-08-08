package easy;

public class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        boolean isNegative = num < 0;
        num = isNegative ? (num + 1) * -1 : num;
        while (num > 0) {
            int current = num % 16;
            if (isNegative) {
                current = 15 - current;
            }
            num /= 16;
            if (current >= 10) {
                result.append((char) (current - 10 + 'a'));
            } else {
                result.append(current);
            }
        }

        if (isNegative) {
            while (result.length() < 8) {
                result.append('f');
            }
        }

        return result.reverse().toString();
    }
}
