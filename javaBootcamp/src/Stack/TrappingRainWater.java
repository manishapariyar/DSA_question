package Stack;

import java.util.Stack;

public class TrappingRainWater {
    public static int trappedRainWater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int waterTrapped = 0;
        st.push(0);

        for (int i = 1; i <arr.length; i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int valleyIndex = st.pop();
                if (st.isEmpty()) break;
                int leftBoundary = st.peek();
                int width = i - leftBoundary - 1;
                int boundedHeight = Math.min(arr[i], arr[leftBoundary]) - arr[valleyIndex];
               waterTrapped += boundedHeight*width;
            }
            st.push(i);
        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trappedRainWater(arr));
    }
}
