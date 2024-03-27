import java.sql.SQLOutput;
import java.util.Scanner;

class SumOfAllOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
         int n = scanner.nextInt();
         int sum = 0;
         for (int i = 1 ; i<n;i++) {
             if (i % 2 != 0) {
                 sum += i;
             }}
        System.out.println("the sum of odd number" + sum);
    }

}
