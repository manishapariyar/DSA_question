package HashMap;

import java.util.*;

public class ImplementOfHashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Manisha", 100);
        hm.put("nisha", 50);
        hm.put("Isha", 0);

        System.out.println(hm);
        // iteration on hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

    }
}
