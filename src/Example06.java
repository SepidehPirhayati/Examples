//Write a Java program to multiply two binary numbers
import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input first number :");
        long num1 = in.nextLong();
        System.out.println("Input second number :");
        long num2 = in.nextLong();

        int temp = 1;
        long digit, result = 0;

        while (num2 != 0){
            digit = num2 % 10;
            num1 *= temp;
            if (digit == 1)
                result = sumNum(num1,result);
            num2 /= 10;
            temp = 10;
        }

        System.out.println("Result is: " + result);
    }

    private static long sumNum(long num1,long num2){
        int[] sum = new int[20];
        int carry=0 , i=0;
        long result = 0;
        while (num1 != 0 || num2 != 0 ){
            sum[i++] =(int)((num1 % 10 + num2 % 10 + carry) % 2);
            carry = (int)((num1 % 10 + num2 % 10 + carry) / 2);
            num1 /= 10;
            num2 /= 10;
        }

        if( carry != 0){
            sum[i++] = carry;
        }
        i--;

        while (i>=0){
            result = result *10 + sum[i--];
        }
        return result;
    }
}
