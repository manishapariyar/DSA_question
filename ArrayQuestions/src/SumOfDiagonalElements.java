public class SumOfDiagonalElements {
    public static void main(String[] args) {
        int[][] arrNum = ArrayUtility.input2DArrays();
         long sum = sumOfDiagonals(arrNum);
        System.out.println(sum);
    }
    public static long sumOfDiagonals(int[][] numArr){
        long leftSum = sumOfLeftDiagonals(numArr);
        long rightSum = sumOfRightDiagonals(numArr);
        long sum = leftSum+rightSum;
        if(numArr.length%2==0){
          int i = numArr.length/2;
          sum -= numArr[i][i];
        }
        return sum;
    }public static long sumOfLeftDiagonals(int[][] numArr){
   long sum = 0;
        for (int i = 0; i <numArr.length ; i++) {
            for (int j = 0; j < numArr.length; j++) {
             sum +=numArr[i][i];
            }
        }
        return sum;
    }public static long sumOfRightDiagonals(int[][] numArr){

        long sum = 0;
        for (int i = 0; i <numArr.length ; i++) {
            for (int j = numArr.length-1; j >0; j++) {
                sum +=numArr[i][i];
            }
        }
        return sum;
    }


}
