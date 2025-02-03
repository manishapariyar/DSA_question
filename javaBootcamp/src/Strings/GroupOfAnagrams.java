package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupOfAnagrams {

    public static void main(String[] args) {
        String[]  strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> listOfAnagrams = new ArrayList<>();

        for (int i = 0; i <strs.length ; i++) {

                char[] character = strs[i+1].toCharArray();

                Arrays.sort(character);
               String sortedWord = new String(character);

            System.out.println(listOfAnagrams);


        }

    }
}
