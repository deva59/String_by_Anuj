package Comparable_And_Comparator;

import java.util.*;

//Aap Comparotor(Anonymous) ke under kud ki class bana sakte ho..
    class MyCustomDogComparator implements Comparator<Animal>{

        //weight Accourding Sort
    @Override
    public int compare(Animal o1, Animal o2) {
//        return o1.weight-o2.weight;
        //Integer is wrapper class in comapre method
        //Is ka benifits ye hai - jab aap negative number minus karte ho integer overflow ho jata hai to dikkat ho jati hai
        //E.g min value se aap kuch negative try karna chate ho min value -5 to rotate hoke aapka number vapas positive ho jayaga.
        return Integer.compare(o1.weight,o2.weight);
    }
}
public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(2,"Leo",10);
        Animal a2 = new Animal(2,"Bruno",4);
        Animal a3 = new Animal(2,"Maxo",6);
        Animal a4 = new Animal(3,"Don",3);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        //Sort
//        Collections.sort(dogs, new MyCustomDogComparator());
//        Collections.sort(dogs, new Comparator<Animal>() {

            //name Accourding Sort
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });

        //Using Lamda Expression
//        Collections.sort(dogs,((o1, o2) -> o1.name.compareTo(o2.name)));

        //Using Comaparing Method
//        Collections.sort(dogs,(o1, o2) -> {
//            return o1.name.compareTo(o2.name);
//        });


        //Using Another Methods

//        Collections.sort(dogs, (d1, d2)->{
//            return d1.age - d2.age;
//        });


        //Hamesh Yahi vala Function likhna
//        Collections.sort(dogs, (d1,d2)->{
//            return Integer.compare(d1.weight,d2.weight);
//        });
//
//  System.out.println(dogs);


        //2D Matrix Solve Sort , First Column Basis.
        int a[][]= {
                    {4, 5, 2},
                    {5, 1, 2},
                    {1, 4, 7}
        };

        //Using Lamda method
        //arr1,arr2 references some arrays
//        Arrays.sort(a,(arr1, arr2)->{
//            return arr1[0] - arr2[0];  //First Index Basis
//        });
//
//        for(int e[]:a){
//            for(int element: e){
//                System.out.print(element+" ");
//            }
//            System.out.println();
//        }


        for(int i=0;i<a.length;i++){
            Arrays.sort(a,(arr1,arr2)->{
                return arr1[0]-arr2[0];
            });
            System.out.println(i);
        }



//        Arrays.sort(a, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return 0;
//            }
//        });



    }
}
