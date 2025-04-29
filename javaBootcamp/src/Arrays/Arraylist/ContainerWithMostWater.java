package Arrays.Arraylist;

public class ContainerWithMostWater {
    // for given n lines on x-axis, use 2 lines to
    // form a container such that it holds maximum water
    // h = [1,8,6,2,5,4,8,3,7]



  //brute force
    public static  int waterContainsMost(int[] h){
           int max =0;

        for (int i = 0; i < h.length ; i++) {
            for (int j = 0; j <h.length ; j++) {
                int heigth = Math.min(h[i],h[j]);
                int water = heigth * (j-i);
               max = Math.max(max,water);
            }

        }

        return max;
    }

    //two pointer approach
    public static int waterContain(int[]h){
        int maxWater = 0;
        int start = 0;
        int end = h.length-1;
        while (start<end){
            int maxHeight = Math.max(h[start],h[end]);
            int water = end -start;
            int currentWater = maxHeight*water;
            maxWater =Math.max(maxWater,currentWater);
            if (h[end]>h[start]){
                start++;
            }else{
                end--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
       int[] h = {1,8,6,2,5,4,8,3,7};
        System.out.println(waterContainsMost(h));
    }
}
