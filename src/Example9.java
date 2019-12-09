//Write a Java program to convert a binary number to decimal number
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Binary Number : ");
        long num = in.nextLong();
        System.out.println("Decimal Number is : " + decimalNumber(num));
    }
    private static int decimalNumber (long num){
        int decimalNumber = 0;
        int powTwo = 1;
        int carry;
        while (num != 0){
            carry = (int)(num % 10) ;
            decimalNumber += (carry * powTwo);
            powTwo *= 2;
            num /= 10;
        }
        return decimalNumber;
    }
}
