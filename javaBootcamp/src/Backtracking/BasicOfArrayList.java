package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class BasicOfArrayList {
    static List<List<String>> solutions = new ArrayList<>();

    public static void main(String[] args) {
        int n = 4;
        solveNQueens(n);
        System.out.println("Total Solutions: " + solutions.size());
        for (List<String> sol : solutions) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println("_____________________");
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        ArrayList<ArrayList<Character>> board = new ArrayList<>();

        // initialize the board with '.'
        for (int i = 0; i < n; i++) {
            ArrayList<Character> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add('.'); // empty spot
            }
            board.add(row);
        }

        nQueens(board, 0);
        return solutions;
    }

    public static void nQueens(ArrayList<ArrayList<Character>> board, int row) {
        if (row == board.size()) {
            // convert board to List<String> and add to solutions
            List<String> temp = new ArrayList<>();
            for (ArrayList<Character> r : board) {
                StringBuilder sb = new StringBuilder();
                for (char c : r) {
                    sb.append(c);
                }
                temp.add(sb.toString());
            }
            solutions.add(temp);
            return;
        }

        for (int col = 0; col < board.size(); col++) {
            if (isSafe(board, row, col)) {
                board.get(row).set(col, 'Q');
                nQueens(board, row + 1);
                board.get(row).set(col, '.'); // backtrack
            }
        }
    }

    public static boolean isSafe(ArrayList<ArrayList<Character>> board, int row, int col) {
        // Check vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board.get(i).get(col) == 'Q') return false;
        }

        // Check diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).get(j) == 'Q') return false;
        }

        // Check diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.size(); i--, j++) {
            if (board.get(i).get(j) == 'Q') return false;
        }

        return true;
    }
}
