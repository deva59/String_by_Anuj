package List_By_AnujBhaiya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Literal {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        //Simple For Loop
        for(int i=0;i<fruits.size();i++){
            System.out.println("fruits is "+ fruits.get(i));
        }

        //For Each Loop
        for(String fruit:fruits){
            System.out.println("for each fruit "+fruit);
        }

        //Using Iterator
        Iterator<String>fe = fruits.iterator();//Collection FrameWork (listIterator Bhi same hota hai).

        while (fe.hasNext()){//true if the iteration has more elements
            System.out.println(fe.next());
        }
        try {
            List<String> smallList = fruits.subList(1, 6);//Return Small List on basis of index position Using subList Method
            System.out.println(smallList);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Bhaiya Thodi Length Shoti Dalo..");
        }

    }
}
