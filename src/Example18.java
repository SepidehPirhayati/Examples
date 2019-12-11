/*Write a Java program that accepts two integer values between 25 to 75 and
 return true if there is a common digit in both numbers*/
import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number between 25 and 75 : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1 < 25 || num2 < 25 || num1 > 75 || num2 > 75 )
            System.out.println("The number is not between 25 and 75.");
        else if(num1 % 10 == num2 % 10 || num1 % 10 == num2 / 10 || num1 / 10 == num2 % 10 || num1 / 10 == num2 / 10)
            System.out.println("True");
    }
}
