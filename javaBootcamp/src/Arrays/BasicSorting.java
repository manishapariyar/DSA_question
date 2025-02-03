package Arrays;

public class BasicSorting {
    public static void main(String[] args) {
        int[] array = {3,6,2,1,8,7,4,5,3,1};
 countingSort(array);
        printArray(array);

     }
     public  static  void printArray(int[] array){
         for (int i = 0; i <array.length ; i++) {
             System.out.print(array[i] + " ");

         }
         System.out.println();

     }
     public  static  void bubbleSort(int[] array){
         for (int i = 0; i < array.length-1; i++) {
             for (int j = 0; j <array.length-1-i ; j++) {
                if(array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
             }


         }

     } public  static void insertionSort(int[] array){
        for (int i = 0; i <array.length ; i++) {
            int curr = array[i];
            int pre = i-1;
            while (pre>=0 && array[pre]>curr){
                array[pre+1] = array[pre];
                pre--;
            }
            array[pre+1] = curr;

        }

     }
     public  static  void selectionSort(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            int misPos = i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[misPos] > array[j]){
                    misPos = j;
                }
            }
                int temp = array[misPos];
                array[misPos] = array[i];
                array[i] = temp;



        }
     }

     public  static  void countingSort(int[] array){
        int largest = Integer.MIN_VALUE;
         for (int i = 0; i <array.length ; i++) {
             largest = Math.max(largest, array[i]);
         }
             int[] count = new int[largest + 1];
//counting frequency
             for (int j = 0; j < array.length; j++) {
                 count[array[j]]++;
             }

//             sorting
             int k = 0;
             for (int j = 0; j < count.length; j++) {
                 while (count[j]>0){
                     array[k] = j;
                     k++;
                     count[j]--;
                 }



         }
     }
}
