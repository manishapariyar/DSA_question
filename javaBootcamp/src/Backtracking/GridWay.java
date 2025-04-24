package Backtracking;

public class GridWay {

//    this function tc is O(2^n+m) which is exponential is delay and
    // it can not run in larger variable
    public static int gridWay(int n,int m, int i, int j){
        if (i==n-1&&j==m-1){
            return 1;
        }else if(i==n||j==n){//boundary cross condition
            return 0;
        }
            return gridWay(n,m,i+1,j)+gridWay(n,m,i,j+1);
    }

     public  static  int factorial(int num){
        int fact =1 ;
         for (int i = 2; i <=num ; i++) {
             fact *=i;
         }
         return fact;
     }
    public static int gridWayOp(int n, int m) {

        return factorial(n + m - 2) / (factorial(n - 1) * factorial(m - 1));
    }
    public static void main(String[] args) {
        int n =3, m=3;
        System.out.println(gridWay(n,m,0,0));
        System.out.println(gridWayOp(n,m));
    }
}
