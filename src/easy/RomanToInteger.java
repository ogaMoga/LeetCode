package easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        byte[] src = s.getBytes();
        for (int i = 0; i < src.length; i++) {
            if (i < src.length - 1) {
                switch (src[i]) {
                    case 'I': {
                        if (src[i + 1] == 'V') {
                            res += 4;
                            i++;
                            continue;
                        } else if (src[i + 1] == 'X') {
                            res += 9;
                            i++;
                            continue;
                        }
                        break;
                    }
                    case 'X': {
                        if (src[i + 1] == 'L') {
                            res += 40;
                            i++;
                            continue;
                        } else if (src[i + 1] == 'C') {
                            res += 90;
                            i++;
                            continue;
                        }
                        break;
                    }
                    case 'C': {
                        if (src[i + 1] == 'D') {
                            res += 400;
                            i++;
                            continue;
                        } else if (src[i + 1] == 'M') {
                            res += 900;
                            i++;
                            continue;
                        }
                        break;
                    }
                }
            }
            res += valueOf(src[i]);
        }
        return res;
    }

    public int valueOf(byte letter) {
        switch (letter) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}
