package Recursion;

public class PracticeQuestions {
    static  String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void occurancOfTarget(int[] arr,int target,int i)
    {
        if (i == arr.length){
            return;
        }

        if (arr[i]==target){
            System.out.print(i + " ");
        }
        occurancOfTarget(arr,4,i+1);
    }
public static void printDigits(int num) {
        if (num==0){
            return;
        }
        int lastDigit = num%10;
        int remainingNum = num/10;
        printDigits(remainingNum);
        System.out.print(digits[lastDigit]+ " ");
    }

    public static  int countSubString(String s, int start,int end){
        if (start == s.length()){
            return 0;
        }
        if (end == s.length()){
          return countSubString(s,start+1,start+1);
        }
        int count = (s.charAt(start)== s.charAt(end))?1:0;
        return count+countSubString(s,start,end+1);
    }


    public static void towerOfHanoi(int n, String source, String Helper, String Destination) {
//        base case
        if (n==1){
            System.out.println("transfer disk " + n +" " + "from" +" " +source + " to"+" "  + Destination);
         return;
        }
        towerOfHanoi(n-1,source,Destination,Helper);
        System.out.println("transfer disk " + n +" " + "from" +" " + source + " to" +" " + Destination);
        towerOfHanoi(n-1,Helper,source,Destination);

    }
    public static void main(String[] args) {
////        printDigits(2019);
//        String s = "abcab";
//        System.out.println(countSubString(s,0,0));
        towerOfHanoi(3,"S","H","D");
    }
}
