package in.collectionLiabraries;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List <String> strList = new ArrayList<>();
        strList.add("Manisha");
        strList.add("Pariyar");

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }
        for (String str: strList
             )
            System.out.println(str);{

        }
    }

}