package GreedyAlgo;
import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};
        int amount = 2025;
        Arrays.sort(coins, Comparator.reverseOrder());

        int numberOfCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <coins.length ; i++) {
            if (coins[i]<=amount){
                while (coins[i]<=amount){
                    numberOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total number of coins to give  " +numberOfCoins+ " "+ ans);
    }

}
