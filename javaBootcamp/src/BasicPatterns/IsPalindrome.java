package BasicPatterns;

public class IsPalindrome {
    public static void main(String[] args) {
        int num = 121;
        int dub = 0;
        int digit = 0;
        while(num>0){
            digit = num%10;
            dub = dub*10+digit;
            num = num/10;
        }
      if (num==dub){
          System.out.println("true");
      }else{
          System.out.println(false);
      }
    }
}
