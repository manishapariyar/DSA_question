package Sortings;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println( mergeSort(arr,0, arr.length-1));
//        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public  static  int  mergeSort(int arr[], int si,int ei){
       if (si<ei){

           int mid = si + (ei-si)/2;

           int countLeft = mergeSort(arr,si,mid);
           int countRight =mergeSort(arr,mid+1,ei);
           int currentCount =  merge(arr,si,mid,ei);
           return countLeft+countRight+currentCount;
       }
       return 0;






    }


    public static int merge(int[] arr, int si,int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        int count = 0;

        while(i<= mid && j<= ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else {


                temp[k] = arr[j];
                j++;
                count += mid-i+1;
            }
            k++;
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }   while (j<=ei){
            temp[k++] = arr[j++];
        }
        for (k = 0, i=si; k <= temp.length-1 ;k ++,i++) {
            arr[i] = temp[k];
        }

return  count;
    }
}
