import java.util.Scanner;

class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = scanner.nextInt();
        boolean isArmStrong = isArmStrong(n);
        if (isArmStrong){
            System.out.println("Given number is ArmStrong Number");
        }
        else {
            System.out.println("It is not Armstrong");
        }
    }

    public static boolean isArmStrong(int n) {
        int finalNumber = 0;
    int noOfDigits = noOfDigits(n);
        int digit =0;
        int nCopy = n;
        while (0<n){
         digit = n%10;
         n /=10;
         finalNumber  += powerOfNumber(digit,noOfDigits);
    }
     if(finalNumber == nCopy){
         return true;
     }
     return false;

    }

    public static int noOfDigits(int n){
        int digit = 0;
        while (0<n){
           digit++;
           n/= 10;
        }
        return digit;
    }
    public static int powerOfNumber(int n, int nofDigits){
        int result = 1;
        int i = 0;
         while (i<nofDigits)
         {
             result *= n;
            i++;
         }

        return result;
    }
}
