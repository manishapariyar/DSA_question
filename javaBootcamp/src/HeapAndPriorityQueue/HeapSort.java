package HeapAndPriorityQueue;

public class HeapSort {
    public static void heapSort(int arr[]){
        // step1-- build maxHeap
        int n  = arr.length;
        for (int i = n/2; i >=0 ; i--) {
            heapify(i,n,arr);
        }

        //step2 -- push largest at end
        for (int i = n-1; i >0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i]= temp;
            heapify(0,i,arr);
        }
    }
    private static void heapify(int i , int length, int[] arr){
        int maxIn = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left<length && arr[left]>arr[maxIn]){
            maxIn = left;
        } if (right<length && arr[right]>arr[maxIn]){
            maxIn = right;
        }
        if (maxIn!=i){
            int tem = arr[i];
            arr[i]=arr[maxIn];
            arr[maxIn] = tem;
            heapify(maxIn, length, arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        heapSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
