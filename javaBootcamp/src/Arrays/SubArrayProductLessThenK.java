package Arrays;

public class SubArrayProductLessThenK {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        int count = 0;
         int i = 0; int j = 0;
         int product = 1;

        while(i< nums.length){
            product *=nums[i];
            if (product>=k){
                product = product/nums[j];
                j++;
            }
            count += (i-j+1);
            i++;
        }

        System.out.println(count);

    }

}
