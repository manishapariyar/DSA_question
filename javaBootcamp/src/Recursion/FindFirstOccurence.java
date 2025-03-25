package Recursion;

public class FindFirstOccurence

{
    public static int firstOccurence(int[] n,int target,int i ){
        if (i== n.length){
            return -1;
        }
        if (target == n[i]){
            return i;
        }

        return firstOccurence(n,target,i+1);
    }  public static int lastOccurence(int[] n,int target,int i ){
        if (i== n.length){
            return -1;
        }
        int isfound = lastOccurence(n,target,i+1);
        if (target == n[i] && isfound ==-1){
            return i;
        }

        return isfound;
    }


    public  static  int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1= power(x,n-1);
        return x*xnm1;

    }
    public  static  int opPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfSq = opPower(x,n/2);
        int halfPowSq = halfSq*halfSq;
        if(n%2 !=0){
            halfPowSq = x*halfPowSq;
        }
        return halfPowSq;

    }


    public static void main(String[] args) {
       int n= opPower(2,5);
        System.out.println(n);

    }
}
