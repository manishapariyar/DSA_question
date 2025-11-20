package HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DistinctIntegers {
    public static void main(String[] args) {
        int n = 5;

        HashSet<Integer> hs = new HashSet<>();
        hs.add(n);
        boolean added = true;
        while (added){
            added=false;
            List<Integer> current = new ArrayList<>(hs);
            for (int x :current) {
                for (int i = 1; i <=n ; i++) {
                    if (x%i==1){
                        if (!hs.contains(i)){
                            hs.add(i);
                            added=true;
                        }
                    }
                }
//            System.out.println(i);
            }
        }
        System.out.println(hs.size());
    }
}
