import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//  BToD(n);
//        primeRange(n);
        DToB(n);
    }

    static void primeRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }


    static boolean isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }


            }
        return true;

    }
  static  void BToD(int n) {

      int sum = 0;
      int re = 0;
      int i =0;
      do {
          re = n % 10;
          sum +=(int) (re * Math.pow(2, i));
          i++;
          n = (n / 10);
      } while (n>0);
      System.out.println(sum);
  }

  static  void DToB(int n) {

        int binNum = 0;
        while(n>0){
          binNum = (n%2);
            n  = n/2;
            System.out.print(reverse(binNum));
        }



    }
    static  int reverse(int number ) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            return digit;
        }
      return 0;
    }
}
