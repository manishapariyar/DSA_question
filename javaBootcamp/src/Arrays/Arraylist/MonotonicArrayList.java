package Arrays.Arraylist;

import java.util.ArrayList;

public class MonotonicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
         nums.add(1);
         nums.add(2);
         nums.add(3);

        for (int i = 0; i <nums.size()-1; i++) {
            if (nums.get(i)< nums.get(i+1)&& nums.get(i)>nums.get(i+1)){
                    System.out.print("The arraylist is monotonic");
                }else{
                    System.out.print("not monotonic");
                }
                System.out.println();

        }
    }
}
