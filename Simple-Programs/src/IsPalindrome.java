import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = scanner.nextInt();
        boolean isPailndrome = isPalindrome(n);
        if (isPailndrome){
            System.out.println("Given number is Palindrome");
        }
        else {
            System.out.println("It is not  Palindrome");
        }
    }

    public static boolean isPalindrome(int n) {
          int digit = 0;
          int nCopy = n;
          int sumOfDigits = 0;
          while (0<n){
              digit = n%10;
              sumOfDigits = sumOfDigits*10 +digit;
              n /=10;
          }
        return sumOfDigits == nCopy;
    }
}
