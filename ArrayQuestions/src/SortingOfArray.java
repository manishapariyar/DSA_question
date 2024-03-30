import java.util.Arrays;

class SortingOfArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArrays();
        boolean decreasing = inDecreasing(array);
        boolean increasing = inIncreasing(array);
        if (decreasing||increasing){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is unsorted/Sorted form of arr in ascending order is");
            sorting(array);
        }

    }
        public static void sorting(int[] numArr) {

//             int[] nums = new int[numArr.length];
            Arrays.sort(numArr);
            for (int i = 0; i < numArr.length; i++) {
                System.out.print(numArr[i]+ " ");
            }
        }
    public static boolean inIncreasing(int[] numArr) {


        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] < numArr[i - 1]) {
                return false;
            }


        }
        return true;
    }
     public static boolean inDecreasing(int[] numArr){


        for (int i = 1; i <numArr.length ; i++) {
            if(numArr[i] > numArr[i-1]){
                return false;
            }

        }
     return true;
    }

}
