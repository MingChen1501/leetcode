public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(10)); // false
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        return original == reversed;
    }
}
