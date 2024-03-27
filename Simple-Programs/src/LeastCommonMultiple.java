import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
         int lcm = lcm (num1, num2);
        System.out.println("the least common Factor is :" + lcm );

    }
    public static int lcm(int num1 , int num2){
        for (int i = 1 ; i<=num2 ; i++){
            int factor = num1*i;
            if (factor%num2 == 0){
                return factor;
            }

        }
        return 0;
    }
}
