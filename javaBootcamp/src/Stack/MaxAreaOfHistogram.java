package Stack;

import java.util.Stack;

public class MaxAreaOfHistogram {

    public static void maxArea(int[] arr) {
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];
        // next smaller left
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        //next smaller right
        st = new Stack<>();
        for (int i = arr.length-1; i>=0 ; i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        //current Area : width = j-i -1 = nsr[i]-nsl[i]-1
        for (int i = 0; i <arr.length ; i++) {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currentArea = height-width;
            maxArea = Math.max(maxArea,currentArea);
        }
        System.out.println("maximum area in histogram = "+ maxArea );
    }

    public static void main(String[] args) {
        int[] arr = {7,0,4,2,5,0,6,4,0,5};
        maxArea(arr);
    }
}
