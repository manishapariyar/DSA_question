package Backtracking;

public class NqueenPrintOnlyOne {

    public static  boolean isSafe(char[][] board,int row,int col){

        //vertically up
        for (int i = row-1; i >=0 ; i--) {
            if (board[i][col]=='Q'){
                return false;
            }
        }
        // diagonally right
        for (int i = row-1 , j=col+1; i >=0 && j< board.length ; i--,j++) {
            if (board[i][j]=='Q'){
                return false;
            }
        }

        //diagonally left
        for (int i = row-1, j=col-1; i >=0 && j>=0 ; i--,j--) {
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public  static  void  printBoard(char[][] board){
        System.out.println("___________________________");
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
    public  static boolean nQueen(char[][] board, int row){
        if (row == board.length){
            printBoard(board);
            return true;
        }
        for (int i = 0; i < board.length ; i++) {
            if(isSafe(board,row,i)){
                board[row][i] = 'Q';
                if (nQueen(board,row+1)){
                    return  true;
                }
                board[row][i] = 'X';
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] chessBoard = new char[n][n];

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                chessBoard[i][j] = 'X';
            }
        }
        nQueen(chessBoard,0);
    }
}
