package GreedyAlgo;

public class SmallestStringOfLengthNandSumK {

    public static void main(String[] args) {
        int n = 5;
        int k = 42;
        char arr[] = new char[n];
        for (int i = n-1; i >= 0; i--) {
            k -= i;
            if (k >= 0) {
                if (k > 26) {
                    arr[i] = 'z';
                    k -= 26;
                } else {
                    arr[i] = (char) (k + 97 - 1);
                    k -= arr[i] - 'a' + 1;
                }
            }else
                break;
            k+=i;
        }
        System.out.println(arr);
    }
}
