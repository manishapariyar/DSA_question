package Backtracking;

public class LargestKthSwap {
    static String maxResult = "0";
    public  static  void  largestKthSwap(String s, int k, int start){
        // base condition
        if (k==0|| start == s.length()-1){
            if (s.compareTo(maxResult) > 0) {
                maxResult = s;
            }
            return;
        }
        char maxChar = s.charAt(start);
        for (int j = start+1; j < s.length(); j++) {
            if (s.charAt(j) > maxChar) {
                maxChar = s.charAt(j);
            }
        }


        for (int i = start+1; i <s.length() ; i++) {
            if (s.charAt(start) < s.charAt(i) && s.charAt(i) == maxChar) {
                s=  swap(s,start,i);
                largestKthSwap(s, k - 1, start + 1);
                 s=  swap(s,start,i);
            }
            else {
                largestKthSwap(s, k, start + 1);
            }
        }


    }
    public static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
    public static void main(String[] args) {
        String nums = "09877";
        int k = 4;
        maxResult = nums;
        largestKthSwap(nums, k, 0 );
        System.out.println("Largest number after at most " + k + " swaps: " + maxResult);
    }
}
