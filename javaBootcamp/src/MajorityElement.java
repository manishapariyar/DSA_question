import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {

        int[] n = {2,2,1,1,2,2,2};
        int ans = n[0];
        int majorityThreshold = n.length / 2;
        Arrays.sort(n);
//        for (int i = 0; i <n.length ; i++) {
//            int count =0;
//            for (int j = 0; j < n.length; j++) {
//                if (n[j]==n[i]){
//                    count++;
//                }
//            }
//            if ( count>majorityThreshold){
//                System.out.println(n[i]);
//                break;
//            }
//        }
        int count = 0;
        for (int i = 1; i < n.length; i++) {

            if (n[i]==n[i-1]){
                count ++;
            }else {
                count = 1;
                ans=n[i];

            }
        }
        if (count >majorityThreshold){
            System.out.println(ans);
        }

    }
}
