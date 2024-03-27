import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

         if((num & 1)==1) {
             System.out.println("odd number" +  num);
         } else {
             System.out.println("given number is even" + num);
         }

    }
}