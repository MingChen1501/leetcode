import java.util.Arrays;

/**
 * Solution
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] stringArray = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(stringArray));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        Arrays.sort(strs);
        int stringsLength = strs.length;
        String firstString = strs[0];
        String lastString = strs[stringsLength - 1];
        int firstStringLength = firstString.length();
        int lastStringLength = lastString.length();
        int minLength = Math.min(firstStringLength, lastStringLength);
        for (int i = 0; i < minLength; i++) {
            if (firstString.charAt(i) == lastString.charAt(i)) {
                result += firstString.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }
}