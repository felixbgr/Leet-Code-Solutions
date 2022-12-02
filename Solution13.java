public class Solution13 {
    public int romanToInt(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            char nextChar = 0;
            if(i <= s.length()-2){
                nextChar = s.charAt(i+1);
            }
            switch (s.charAt(i)) {
                case 'I' -> {
                    switch (nextChar) {
                        case 'V', 'X' -> value -= 1;
                        default -> value += 1;
                    }
                }
                case 'V' -> value += 5;
                case 'X' -> {
                    switch (nextChar) {
                        case 'L', 'C' -> value -= 10;
                        default -> value += 10;
                    }
                }
                case 'L' -> value += 50;
                case 'C' -> {
                    switch (nextChar) {
                        case 'D', 'M' -> value -= 100;
                        default -> value += 100;
                    }
                }
                case 'D' -> value += 500;
                case 'M' -> value += 1000;
            }
        }
        return value;
    }
}
