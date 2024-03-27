import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int number = input.nextInt();
        MultipleTable(number);
    }
    public static void MultipleTable(int number) {
        for(int i=1 ; i<=10;i++){
            System.out.println(number + "*" + i + " = " + number*i);
        }
    }
}