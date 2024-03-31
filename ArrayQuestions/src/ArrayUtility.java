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
    public static int[][] input2DArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of number of rows ");
        int rows = sc.nextInt();
        System.out.println("Enter length of number of cols ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <cols ; j++) {
                System.out.print("Enter element numbers for cols " + (i+1) + ":");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        return arr;
    }

}