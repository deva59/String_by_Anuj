package List_By_AnujBhaiya;

import java.util.ArrayList;
import java.util.List;

public class ListImplemention {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1);

        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.indexOf(10));//If Element Present Return Index Position and If Its Not Element Present Return -1 (TC-O(n)).->Array linner Search.

        System.out.println(list.lastIndexOf(1));//Element Present Return Index positon Its last Occurrence

        // list.set(1,30);//Change Element in perticular Index

        list.add(2,1000);//Add Element in Perticular Index TC-O(n)

//       list.remove(Integer.valueOf(1));


        // System.out.println(list);



    }
}
