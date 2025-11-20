package HashMap;

import java.util.HashMap;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,4,4,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums) {
                map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        int mostFre = -1;
        int maxFre = 0;
        for (int key: map.keySet()) {
            if (key%2==0){
               int currFre = map.get(key);
               if (currFre>maxFre){
                   maxFre = currFre;
                   mostFre = key;
               } else if (currFre==maxFre) {
                   if (key<mostFre){
                       mostFre = key;
                   }
               }
            }

        }
        System.out.println("The most frequent even element is: " + mostFre);
    }
}
