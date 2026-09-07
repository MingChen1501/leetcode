/**
 * Solution
 */
public class GCDOfStrings {

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }
    /*
     * Find the greatest common divisor of two strings.
     * @param str1 First string
     * @param str2 Second string
     * @return The greatest common divisor string
     */
    public static String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 is equal to str2 + str1
        // If they are not equal, there is no common divisor string
        // example for equal: str1 = "ABABAB", str2 = "ABAB" => str1 + str2 = "ABABABABAB" and str2 + str1 = "ABABABABAB" => they are equal
        // example for not equal: str1 = "AAA", str2 = "BB" => str1 + str2 = "AAABB" and str2 + str1 = "BBAAA" => they are not equal
        // why we check this: If str1 and str2 have a common divisor string, then the concatenation of str1 and str2 should be equal to the concatenation of str2 and str1. If they are not equal, it means that there is no common divisor string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcdWithLoop(str1.length(), str2.length());
        // Return the substring of str1 from index 0 to gcdLength, which is the greatest common divisor string
        // why we return str1.substring(0, gcdLength): The greatest common divisor string will be the prefix of str1 (or str2) with length equal to the greatest common divisor of the lengths of str1 and str2. This is because if a string can be formed by repeating another string, then the length of the repeating string must divide the length of the original string.
        return str1.substring(0, gcdLength);
    }
    // Calculate the greatest common divisor of two integers using the Euclidean algorithm recursively
    private static int gcdWithrecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdWithrecursive(b, a % b);
    }
    // Calculate the greatest common divisor of two integers using the Euclidean algorithm with a loop
    private static int gcdWithLoop(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * recursive
     * Time complexity: O(n + m), where n is the length of str1 and m is the length of str2.
     * Space complexity: O(n + m) + O(log(min(n, m)), where n is the length of str1 and m is the length of str2. The O(log(min(n, m))) term comes from the recursive call stack.
     * loop
     * Time complexity: O(n + m), where n is the length of str1 and m is the length of str2.
     * Space complexity: O(n + m), where n is the length of str1 and m is the length of str2.
     * why loop is better than recursive: The loop version has a lower space complexity because it does not use the call stack for recursion, making it more efficient in terms of memory usage.
     */
}