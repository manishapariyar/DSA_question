package Sortings;

import java.util.Arrays;
import java.util.Comparator;

public class AllCellsDistOrderEx {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        int rCenter = 0;
        int cCenter = 1;
        int[] abs = new int[rows];
        int index = 0;
        int[][] disMat = new int[rows *cols][2];
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <cols; j++) {
                disMat[index][0] = i;
                disMat[index][1] = j;
                index++;

            }

        }
        Arrays.sort(disMat, Comparator.comparingInt(cell -> Math.abs(cell[0]-rCenter)+
                Math.abs(cell[1]-cCenter)));

        for (int[] cell:disMat
             ) {
            System.out.println(Arrays.toString(cell));

        }

    }
}
