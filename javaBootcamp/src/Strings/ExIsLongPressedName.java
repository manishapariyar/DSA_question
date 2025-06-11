package Strings;

public class ExIsLongPressedName {
    public static void main(String[] args) {
        String name = "saeed";
        String typed = "ssaaedd";
        int i =0, j = 0;
        while ( j < typed.length()){
            if (i<name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            } else if ( j>0 && typed.charAt(j) == typed.charAt(j-1)) {
                      j++;
            } else{
                System.out.println("the name is not long pressed");
                break;
            }
        }
        if (i == name.length()) {
            System.out.println("The name is long pressed.");
        } else {
            System.out.println("The name is not long pressed.");
        }

    }

}
