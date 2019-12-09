//Write a Java program to convert a decimal number to binary number

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Decimal number : ");
        int num = in.nextInt();
        int [] temp =new int[20];
        int i =0;

        while (num != 0){
            temp[i++] = num % 2;
            num /= 2;
        }
        System.out.print("Result is : ");
        for (int k = i-1 ; k >= 0 ; k--) {
            System.out.print(temp[k]);
        }
    }
}
