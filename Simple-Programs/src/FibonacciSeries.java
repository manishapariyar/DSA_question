import java.util.Scanner;

class FibonacciSeries {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the numbers");
         int n = scanner.nextInt();
         int c = 0;
         int a =0,b=1;
         for (int i = 1; i<=n;i++){
                 c = a+b;
                 a=b;
                 b=c;
                 System.out.println(c);
         }

     }
}
