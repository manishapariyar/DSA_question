package Strings;

public class Strings {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(compress(str));
    }




    public static String compress(String str) {

        String  newStr = "";
        for (int i = 0; i<str.length() ; i++) {
            Integer count = 1;
            while (i <str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            newStr += str.charAt(i);
            if (count>1){
                newStr += count.toString();
            }

        }
      return  newStr;
    }
    public  static  float getShortestPath(String  path){
        int x =0 ,y=0;
        for (int i = 0; i <path.length() ; i++) {
            char des = path.charAt(i);
            if (des == 'S'){
                y--;
            }
            else if (des == 'N'){
                y++;
            }
           else if (des == 'W'){
                x--;
            }
            else {
                x++;
            }

        }
        int x2 = x*x;
        int y2 = y*y;
        return ((float)Math.sqrt(x2+y2));
    }
    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i <n/2 ; i++) {

            if (str.charAt(i) != str.charAt(n-1-i)){
               return false;
            }
        }
    return true;
    }

    public  static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i <str.length() ; i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
}
