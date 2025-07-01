package DailyQuestion;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flower = {1,0,0,0,1};
        int n = 2;
        for (int i = 1; i <flower.length-1; i++) {
            if(flower[i-1] == 0 && flower[i+1]==0 && flower[i]==0) {
                    flower[i] = 1;
                    n--;
            }
          if (n==0) break;
        }
        if (n==0){
            System.out.println("plant planted");
        }else{
            System.out.println("can't planted");
        }

    }
}
