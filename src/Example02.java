//Write a Java program that takes a number as input and prints its multiplication table upto 10

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" input number : ");
        int num = input.nextInt();

        for (int i = 1 ; i <=10 ; i++ ){
            System.out.println( num + " * " + i +" = " + num*i );
        }
    }
}

