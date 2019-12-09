//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input first number");
        int num1 = input.nextInt();
        System.out.println("input second number");
        int num2 = input.nextInt();

//      **** sum ****
        int result = num1 + num2;
        System.out.println("sum is : " + result);
//      **** multiply ****
        result = num1 * num2;
        System.out.println("multiply is : " + result);
//      **** subtract ****
        result = (num1>num2)? (num1 - num2) : (num2 - num1);
        System.out.println("subtract is : " + result);
//      **** divide ****
        result = (num1>num2)? (num1 / num2) : (num2 / num1);
        System.out.println("divide is : " + result);
//      **** remainder ****
        result = (num1>num2)? (num1 % num2) : (num2 % num1);
        System.out.println("remainder is : " + result);

    }
}
