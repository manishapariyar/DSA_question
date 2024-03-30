import java.util.Scanner;

class SumAndAverage {
    public static void main(String[] args) {

        System.out.println("Sum and average in array");
        int[] arr = ArrayUtility.inputArrays();
        int sum = 0;
        double average = 0;

        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        average = (sum/arr.length);
        System.out.println(average);

    }
}