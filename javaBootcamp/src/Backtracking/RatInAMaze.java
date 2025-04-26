package Backtracking;

public class RatInAMaze {



    public static  boolean ratInMaze(int[][] maze, int[][] solution,int i, int j){
       if (i==maze.length-1 && j ==maze.length-1 && maze[i][j]==1){
           solution[i][j] =1;
           return true;
       }

       // check if maze[i][j] is valid
        if (i>=0&& i< maze.length&& j>=0 && j< maze.length && maze[i][j]==1){
            if (solution[i][j]==1)
                return false;
                solution[i][j] =1;
               if(ratInMaze(maze,solution,i+1,j))
                   return true;
               if (ratInMaze(maze,solution,i,j+1))
                   return true;
               solution[i][j]=0;
               return false;

        }
        return false;
    }
    public static void printSolution(int[][] solution){
        for (int i = 0; i <solution.length ; i++) {
            for (int j = 0; j <solution.length ; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
//                {1,0,0,0},
//                {1,1,0,1},
//                {0,1,0,0},
//                {0,1,1,1},
                {1,1},
                {1,1}
        };
        int n = arr.length;
   int[][] solution = new int[n][n];
   if (!ratInMaze(arr, solution, 0, 0)){
       System.out.println("Solution doesn't exist");
   }
   printSolution(solution);
    }

}
