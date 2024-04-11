
//https://leetcode.com/problems/find-the-highest-altitude/
public class FindTheHighestAltitube {
    public static void main(String[] args) {
      int[] arr = {-5,1,5,0,-7};
      int num = largestAltitude(arr);
        System.out.println(num);

    }
    public  static int largestAltitude(int[] gain)
    {
        int max = 0;
        int current =0;

        for (int i = 0; i < gain.length ; i++) {
             current += gain[i];
            if(max<current){
                max= current;
            }
        }
        return max;
    }
}
