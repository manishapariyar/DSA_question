package Arrays.Arraylist;

import java.util.ArrayList;

public class KidsWithCandies {
    public  static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandie){
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = 0;
        for (int i = 0; i <candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for ( int candie: candies) {
            int add = candie + extraCandie;
            if (add >= max) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] candies = {2,8,7};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
