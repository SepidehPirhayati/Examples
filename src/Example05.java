//Write a Java program to add two binary numbers
import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {

        int[] sum = new int [10];
        int carry = 0 , i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input first binary number :");
        long input1 = in.nextLong();
        System.out.println("Input second binary number :");
        long input2 = in.nextLong();

        while (input1 != 0 || input2 != 0 ){
            sum[i++] =(int)((input1 % 10 + input2 % 10 + carry) % 2);
            carry = (int)((input1 % 10 + input2 % 10 + carry) / 2);
            input1 /= 10;
            input2 /= 10;
        }
        if( carry != 0){
            sum[i++] = carry;
        }
        i--;
        System.out.println("Sum is :");
        while (i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println();
    }
}
