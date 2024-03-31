class SumAndAverageIn2D {
    public static void main(String[] args) {
        System.out.println("Sum and Average in 2D array");
        int[][] arr1 = ArrayUtility.input2DArrays();

        int sum = 0;
        double average = 0;
        for (int[] ints : arr1) {
            for (int j = 0; j < arr1.length; j++) {
                sum += ints[j];
            }
        }
        average = (double) sum /arr1.length;
        System.out.println("sum of array"+ sum);
        System.out.println("average of array"+ average);

    }
}
