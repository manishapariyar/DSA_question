package Arrays;

import java.util.Comparator;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] number = {-2,-3,4,-1,-2,1,5,-3};
        int target = 10;
        kadanesMaxSubArray(number);
    }
    public static  int linearSearch(int[] n, int target){
          int largest = Integer.MIN_VALUE;
        for (int i = 0; i <n.length ; i++) {
            if (n[i] > largest){
                largest = n[i];

            }
        }
        return largest;
    }
    public  static  int binarySearch(int[] n, int target){
       int start = 0;
       int end = n.length-1;


       while(start<=end){
           int min = start +(end-start)/2;
           if (n[min] < target) {
               start = min+1;

           }  if(n[min]>target){
               end = min-1;
           }
           else {
               return min;
           }
       }


        return -1;
    }

    public  static  void  printPairs(int numbers[]){
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i+1; j <numbers.length ; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totalPairs++;
            }
            System.out.println();
            System.out.println("Total pairs is" + " " + totalPairs);

        }
    }


    static void printSubArrays(int n[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <n.length ; i++) {

            for (int j = i; j <n.length ; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(n[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    static void maxPrefixArray(int[] n){
        int curSum  = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[n.length];
         prefix[0] = n[0];
//        calculating prefix
        for (int i = 1; i< n.length ; i++) {
            prefix[i] = prefix[i-1] + n[i];
        }

        for (int i = 0; i <n.length ; i++) {
            for (int j = i; j < n.length; j++) {
                curSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }

        }
        System.out.println(maxSum);



    }


    static void kadanesMaxSubArray(int[] number){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if(number[i]<0){
                maxSum = number[i];
            }

        }
        for (int i = 0; i < number.length ; i++) {
            currSum = currSum+ number[i];
            if(currSum <0){
               currSum =0;
            }
            maxSum = Math.max(currSum, maxSum);


        }
        System.out.println(maxSum);
    }

    public static void sort(double[][] ratio, Comparator<Object> objectComparator) {
    }

    public static void sort(int[] abs) {
    }


    public static class introOfJava {

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
}
