package Arrays;

import java.util.Arrays;

public class MergeSortArrays {

    public static void mergeSortArr(){
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,4,5};
        int m=3,n=3;
        int i = m-1;
        int j= n-1;
        int index=(m+n-1);
        while (i>=0&&j>=0){
            if (n1[i]<=n2[j]){
                n1[index] = n2[j];
                index--;
                j--;
            }
            else {
                n1[index] = n2[i];
                index--;
                i--;
            }

        }
        while (j>=0){
            n1[index] = n2[j];
            index--;
            j--;
        }
        System.out.println(Arrays.toString(n1));
    }
    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,4,5};
        int index=0;
        for (int i = 0; i <n1.length ; i++) {
            if (n1[i]==0 && index<n2.length){
                n1[i]=n2[index];
                index++;
            }

        }
       mergeSortArr();
    }
    public static void mergeSort(int arr[],int start,int end){

        if (start<end){
            int mid = start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static int[] merge(int[]arr,int start,int mid,int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            temp[k++]=arr[i++];
        }
        while (j<=end){
            temp[k++] = arr[j++];
        }
        for ( k = 0 ,i=start; k <=temp.length-1 ; k++,i++) {
            arr[i]=temp[k];

        }
        return arr;
    }
}
