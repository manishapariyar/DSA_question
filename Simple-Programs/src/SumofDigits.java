import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();

        int sumOfDigits = 0;
        while (0<number){
            int digit = number%10;
            sumOfDigits += digit;
            number /=10;
        }
        System.out.println(sumOfDigits);
    }
}
