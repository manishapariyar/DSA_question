package in.collectionLiabraries;

import java.util.Collection;

public class Utility {
    public static <T>void print(Collection<T> collection) {
        for (T coll: collection)
        {
            System.out.printf("%s ",coll);
        }
    }
}
