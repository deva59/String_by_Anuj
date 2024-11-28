package String_by_AnujBhiya;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Name...");
        String firstName = sc.nextLine();
//        sc.next()->MULTIPLE LINE NOT PRINT
        System.out.println("Enter Your Second Name...");
        String secondName = sc.nextLine();

        System.out.println("Your Full Name is " + firstName + " " + secondName);

    }
}
