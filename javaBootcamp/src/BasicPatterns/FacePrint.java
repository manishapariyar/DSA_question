package BasicPatterns;

public class FacePrint {
    public static void main(String[] args) {
         squareBigHollow();


    }
    public static void squareHollow(){

        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println();
            
        }
    }
    public static void squareBigHollow(){

        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println();

        }
    }

    public  static void pyramid(){
        int n = 5;
        for (int i = 0; i <n ; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        }




}
