package Sortings;

import java.util.*;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsEx {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> map = new HashMap<>();

        for (int i = 0; i <str.length; i++) {
            char[] chars = str[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str[i]);

        }
        List<List<String>> groupedAnagrams = new ArrayList<>(map.values());

        System.out.println(groupedAnagrams);
    }



}
