package BitManipulation;

public class CountSetBit {
    public static void main(String[] args) {
        int count = 0;
        int n = 9;
        while(n>0){
            if((n&1) !=0){
                count ++;
            }
            n = n>>1;
        }
        System.out.println(count);
        fastExpo();
        swappingWithoutThirdVaribale();
    }

//    square of a number;
    public static void fastExpo( ){
        int a = 5;
        int n = 3;
        int ans = 1;
        while (n>0){
            if((n&1) !=0){
                ans = ans*a;
            }
            a = a*a;
            n = n >>1;
        }
        System.out.println(ans);
    }
    public static void swappingWithoutThirdVaribale(){
        int a = 5;
        int b = 7;
        System.out.println("Unswapped values" + " " + a + " " + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("swapped values" + " " + a + " " + b);

        for (char i = 'A'; i<='Z' ; i++) {
            System.out.print((char) (i |  ' '));


        }
        System.out.println();
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print((char) (i & '_'));
        }

    }
}
