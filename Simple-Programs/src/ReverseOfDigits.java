import java.util.Scanner;

class ReverseOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = scanner.nextInt();
        int reverseNum = 0;
        while (0<n){
            int digit = n%10;
            reverseNum = reverseNum*10 +digit;
            n/= 10;
        }
        System.out.println(reverseNum);
    }
}
