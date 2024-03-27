import java.util.Scanner;

class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = scanner.nextInt();
         boolean primeOrNot = isPrime(n);
        System.out.println(primeOrNot);
    }
    public static boolean isPrime(int n){
        int i = 2;
        while (i<n){
            if (n%i==0) {
                return false;
            }



            i++;
        }
        return true;
    }

}
