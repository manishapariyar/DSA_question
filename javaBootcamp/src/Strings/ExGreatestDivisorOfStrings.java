package Strings;

public class ExGreatestDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get the greatest common divisor of the lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring from str1 (or str2) of length gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to calculate GCD of two integers
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);

    }
    public static void main(String[] args) {
        String str1 = "ababab";
        String str2 = "abab";
        System.out.println(gcdOfStrings(str1,str2));
    }
}
