package GreedyAlgo;


public class KthOddLargeElementBTWLandR {
    public static int kthOdd(int l,int r, int k) {
        int count = 0;
        for (int i = r; i >= l; i--) {

          if (i % 2 == 1 || i % 2 == -1) {
                   count++;
                   if (count==k){
                       return i;
                   }

              }

        }
        return 0;
    }
    public static void main(String[] args) {
        int l =-3;
        int r = 3;
        int k = 1;
        System.out.println(kthOdd(l,r,k));
    }
}
