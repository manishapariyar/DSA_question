public class TrappingWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};

        System.out.println(trappedRainWater(arr));
    }
    static  int trappedRainWater(int[] arr){
        int n = arr.length;
//        calculate left max boundary -array
        int[] leftMax = new int[n];
         leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i],leftMax[i-1] );

        }


//        calculate Right max boundary -array

         int[] rightMax = new int[n];
          rightMax[n-1] = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
             rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

//        loop
        int trappedWater = 0;

        for (int i = 0; i <n ; i++) {
            // waterLevel = min(left-max bound ,right max bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            // trapped water = (water-level - height )*width
            trappedWater += waterLevel-arr[i];
        }
        return trappedWater;


    }
}
