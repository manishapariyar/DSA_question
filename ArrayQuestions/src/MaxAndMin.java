import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arrayNum = ArrayUtility.inputArrays();
        if (arrayNum.length ==0){
            System.out.println("we can't find max and min ");
        }

      int MaxValue = max(arrayNum);
        System.out.println(" Max value is -"+MaxValue);
      int MinValue = min(arrayNum);
        System.out.println("Min value is-"+MinValue);
    }

    public static int max(int[] arr) {

        int number = arr[0];
        int i;

        for ( i = 1; i <arr.length ; i++) {

            if (number<arr[i]){
                number = arr[i];
            }

        }
     return number;
    }

  public static int min(int[] arr) {

        int number = Integer.MAX_VALUE;
        int i;

        for ( i = 1; i <arr.length ; i++) {

            if (number>arr[i]){
                number = arr[i];
            }

        }
     return number;
    }
}
