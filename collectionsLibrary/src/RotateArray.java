import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/description/
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
         int k = 3;
//         k = k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);



        System.out.println(Arrays.toString(arr));
    }
    public  static int swap(int[] arr,int i,int j){
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
        return  swap;
    }  public  static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
