import java.util.Scanner;

public class introOfJava {

    public static void main(String[] args) {
        //Data type variable and operator,
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        binominalCoe(n,m);

//        for(int i = 1; i<=n; i++){
//            for (int j =i; j<= (n-i)+1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



    }
    static  void  binominalCoe(int a,int b){
       int n =  factOfNum(a);
      int r = factOfNum(b);
      int p = factOfNum(a-b);
       int oh  =( r* p);
       int bc = (n / oh );
        System.out.println(bc);

    }
    static int factOfNum(int n){
        int j = 1;
        for (int i = 1; i <=n; i++) {
            j = j*i;

        }
       return j;

    }
}
