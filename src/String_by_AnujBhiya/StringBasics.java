package String_by_AnujBhiya;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Devendra";
        String sameName = "Devendra";
        String newName = new String("Devendra");

        System.out.println(name);
        System.out.println(newName);

//        if(name == sameName){ //Compare To References..
//            System.out.println("Both are same");
//        }
//
//        if(name == newName){ //sameName -> BOTH ARE SAME
//            System.out.println("Both Are Same");
//        }else {
//            System.out.println("Both are not same");
//        }

//        if(name.equals(newName)){ //Compare to not Reference
//            System.out.println("name and newName have same values");
//        }else {
//            System.out.println("Not same");
//        }

        if(name.equalsIgnoreCase(newName)){
            System.out.println("name and newName have same values");
        }else {
           System.out.println("Not same");
        }


    }
}
