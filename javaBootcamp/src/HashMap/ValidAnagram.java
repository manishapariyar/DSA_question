package HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean validAnagram(String r, String p){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < r.length(); i++) {
            map.put(r.charAt(i),map.getOrDefault(r.charAt(i),0)+1);
        }
        for (int i = 0; i <p.length() ; i++) {
            char ch = p.charAt(i);
            if (map.get(ch)!=null){
               if(map.get(ch)==1){
                   map.remove(ch);
               }else{
                   map.put(ch,map.get(ch)-1);
               }
            }else {
                return false;
            }
        }
        if (map.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        String r = "anagram";
        String p = "nagaram";
        System.out.println(validAnagram(r,p));

    }
}
