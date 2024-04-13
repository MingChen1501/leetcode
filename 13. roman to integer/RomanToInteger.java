import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("IV")); // 4
        System.out.println(romanToInt("IX")); // 9
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }

    private static int romanToInt(String string) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i > 0 && romanMap.get(string.charAt(i)) > romanMap.get(string.charAt(i - 1))) {
                result += romanMap.get(string.charAt(i)) - 2 * romanMap.get(string.charAt(i - 1));
            } else {
                result += romanMap.get(string.charAt(i));
            }
        }
        return result;
    }
}