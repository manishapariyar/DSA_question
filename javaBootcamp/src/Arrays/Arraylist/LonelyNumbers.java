package Arrays.Arraylist;

import java.util.ArrayList;

public class LonelyNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(8);
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) + 1 < list.get(i + 1) && list.get(i) > list.get(i - 1) + 1) {
                newList.add(list.get(i));
            }
        }

        if (list.size()==1){
            newList.add(list.get(0));
        }if (list.size()>1){
            if (list.get(0)-list.get(1)>1){
                newList.add(list.get(0));
            }
            if (list.get(list.size()-2)+1<list.get(list.size()-1)){
                newList.add(list.get(list.size()-1));
            }
        }
        System.out.print(newList);

    }
}
