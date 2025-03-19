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


    public static void main(String[] args) {
        int[] arr = {5,5,5,5};
        int target = 5;
        int  n= lastOccurence(arr,target,0);

        System.out.println(n);
    }
}
