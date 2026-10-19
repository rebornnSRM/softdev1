package week6;

import java.util.Scanner;
public class ScannerExmple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = null;
        int number = 0;
        float dec = 0;



        System.out.println(" Enter your name ");
        firstName = input.next();
        System.out.println("First name: " + firstName);
        
        System.out.println("Enter a whole number");
        number = input.nextInt();

        System.out.println(" Enter a decimal number ");
        dec = input.nextFloat();

        System.out.println(number + " and " + dec);
        input.close();
        
    }
    
}
