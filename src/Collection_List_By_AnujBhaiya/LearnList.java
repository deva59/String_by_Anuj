package List_By_AnujBhaiya;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        list.add(10);
        list.add(20);
        list.add(1);

        list2.add(1);
        list2.add(2);
        list2.add(3);



        System.out.println(list);

//        System.out.println(list.size());
//
//        System.out.println(list.contains(10));//Time Complexity O(n) -linnear Search
//
//        list.remove(1);//Remove Index
//
//        list.remove(Integer.valueOf(1));//Remove Perticular Object/Element.
//        System.out.println(list);

        //  list.addAll(list2);

        //  list.removeAll(list2);

        //   list.retainAll(list2);

        //  list.clear();//empty list

        // list Convert to Array use toArray() type method.
        Object a[] = list.toArray();

        for(Object e : a){
            Integer temp =(Integer)e;
            System.out.println(e);
        }
        System.out.println(list);
    }
}
