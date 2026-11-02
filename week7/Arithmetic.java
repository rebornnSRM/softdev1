package week7;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0, result = 0;

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second numbe : ");
        second = input.nextInt();
        result = first + second;
        System.out.println(first + " + " + second + " = " + result);
        input.close();
    }
    
}
