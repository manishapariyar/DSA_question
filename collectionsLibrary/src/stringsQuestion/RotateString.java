package stringsQuestion;

public class RotateString {
    public static void main(String[] args) {
        String str= "abcde", nstr="";
        char ch;
        String goal ="ahsinam";

        System.out.print("Original word: ");
        System.out.println(str); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println(nstr);
        if (goal.equals(nstr)){
            System.out.println("both are same");
        }
        else {
            System.out.println("not same");
        }


    }
}
