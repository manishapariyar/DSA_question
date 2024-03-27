import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Integers");
        int n1= in.nextInt();
        int n2 = in.nextInt();
       int gcd = gcd(n1,n2);
        System.out.println("GCD of two numbers " +  gcd);
    }
    public static  int gcd(int n1, int n2){
       int gcd = 1 ;
       int i = 2;
       int leastNum = least(n1,n2);
       while ( i<=leastNum){
           if(n1%i==0 && n2%i==0){
             gcd = i;
           }
        i++;
       }
        return gcd;
    }
    public  static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
