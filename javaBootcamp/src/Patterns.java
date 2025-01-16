import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
      diamond_pattern(n);

    }
    static  void  hollow_pattern(int n ,int m){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=m; j++) {
                if (i==1 || i==n || j == 1 || j==m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static  void invert_halfPyramid (int n ,int m ){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= (n-i); j++) {

                    System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


    }
    static  void  inverted_halfPyramid(int n  ){
        for (int i = 1; i <= n ; i++) {
             for (int j = i; j <= n; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
    static  void floydTringle(int n){
        int count =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();

        }

    }
    static  void zeroOnePattern(int n){

        for (int i =1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }


            }
            System.out.println();
        }
    }

    static void butterflyPattern (int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            } for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }for (int i = n; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            } for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void  solid_rhombus(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
               if(i==1|| i==n || j==1||j==n){
                   System.out.print("*");
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println();

        }
    }

    static  void diamond_pattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = n-1; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i  ; j++) {
                System.out.print("*");
            }for (int j = 1; j<i  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        } for (int i = n; i >=1 ; i--) {
            for (int j = n-1; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i  ; j++) {
                System.out.print("*");
            }for (int j = 1; j<i  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void  halfPyramid(int n){
        char v = 'a';

        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(v);
                v++;
            }
            System.out.println();
        }
    }
}
