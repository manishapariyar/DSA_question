import java.util.Arrays;

public class ProductOfArrayExceptSelf
{
    public static void main(String[] args) {
        int[]  array = {1,2,3,4};
        int[] letfProduct = new int[array.length];
        int[] rightProduct = new int[array.length];
        int[]  ans = new int[array.length];
        letfProduct[0] =1;
        for (int i = 1; i < array.length ; i++) {
            letfProduct[i] = array[i-1]*letfProduct[i-1];
        }
        rightProduct[array.length-1]=1;
            for (int i = array.length -2; i >=0 ; i--){
            rightProduct[i] = array[i+1]*rightProduct[i+1];
        }for (int i = 0; i < array.length ; i++) {
            ans[i] = rightProduct[i]*letfProduct[i];
        }

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(productExceptSelf(array)));
    }
    public  static  int[] productExceptSelf(int[] array) {
        int n = array.length;
        int[] ans = new int[n];

        // Calculate left products and store in the result array `ans`
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = leftProduct;
            leftProduct *= array[i];
        }

        // Calculate right products and update the result array `ans`
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= array[i];
        }

        return ans;
    }
}
