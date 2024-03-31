
class ReverseOfArray {

    public static void main(String[] args) {
      int[] numArr =  ArrayUtility.inputArrays();
  reverse(numArr);
    }

    public  static  void  reverse(int[] ar){
        for (int i = 0; i <ar.length/2 ; i++) {
            int swap = ar[i];
            ar[i] = ar[(ar.length - 1) - i];
            ar[(ar.length - 1) - i] = swap;
        }
        for(int i = 0; i <ar.length; i++) {
            System.out.print(ar[i]);
        }
    }


}
