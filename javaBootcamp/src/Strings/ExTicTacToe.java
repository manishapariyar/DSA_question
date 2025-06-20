package Strings;

import java.util.Arrays;

public class ExTicTacToe {
    public static void main(String[] args) {
        int[][] moves = {{0, 0}, {1, 1}, {0, 1}, {2, 0}, {1, 0}, {2, 1}};
        String[][] board = new String[3][3];

        String a = "X";
        String b = "O";

        for (int i = 0; i < board.length ; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            if (i % 2 == 0) {
                board[row][col] = "X";  // Player A
            } else {
                board[row][col] = "O";  // Player B
            }

        }
        System.out.print(Arrays.deepToString(board));
    }
}
