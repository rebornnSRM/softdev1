package week6;

import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name = "";
    System.out.println(" Enter name ");
    name = input.next();
    System.out.println("Name: " + name);
    System.out.println("Name: ".concat(name));



    System.out.println("First 3 characters of " + name + " : " + name.substring(0, 3));
    input.close();


        
    }
    
}
