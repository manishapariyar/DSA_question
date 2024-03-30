import java.util.Scanner;

class NumberOfOccurrences {
     public static void main(String[] args) {
         int[] num = ArrayUtility.inputArrays();
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your number");
         int number = input.nextInt();

         int count= 0;
         for (int i = 0; i <num.length ; i++) {
             if(num[i]==number){
                 count++;
             }

         }
         System.out.println(count);
     }
}
