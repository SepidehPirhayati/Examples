//Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fist number : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();
        System.out.println("Result is : " + (num1 - (num1/num2)*num2));//y=ax+b -> b=y-ax
    }
}
