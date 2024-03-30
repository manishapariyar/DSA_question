import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element numbers " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        return arr;
    }

}