import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int[][] accounts = new int[3][3];
        for (int i = 0; i < accounts.length ; i++) {
            for (int j = 0; j < accounts.length ; j++) {
                accounts[i][j] = input.nextInt();
            }}
        int max = maximumWealth(accounts);
        System.out.println( "the richest person value is " + max);
    }
    public  static  int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person<accounts.length  ; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length ; account++) {
               sum = accounts[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return  ans;
    }
}
