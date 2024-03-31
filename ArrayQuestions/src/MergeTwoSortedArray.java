
class MergeTwoSortedArray {
     public static void main(String[] args) {
         System.out.println("Merging sorted arrays");
         int[] arr1 = ArrayUtility.inputArrays();
         int[] arr2 = ArrayUtility.inputArrays();
          int[] mergedArr = merge(arr1,arr2);
         for (int j : mergedArr) {
             System.out.print(j);
         }

     }
     public static int[] merge(int[] a1, int[] a2){
         int newSize = a1.length+a2.length;
        int[] mergedArr = new int[newSize];
        int  k = 0,i = 0, j =0;

             while (i< a1.length || j<a2.length) {
                 if(j==a2.length|| (i< a1.length && a1[i]<a2[j])){
                     mergedArr[k] = a1[i];
                     i++;

                 }
                 else {
                     mergedArr[k] = a2[j];
                     j++;
                 }
                 k++;
             }


         return mergedArr;
     }
}
