//Write a Java program to check if a positive number is a palindrome or not.
import java.util.Scanner;

public class Example36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = in.nextInt();
        String str = String.valueOf(number);
        int length = str.length();
        int i = 0;
        boolean isTrue = true;
        while (isTrue && i < (length/2)){
            if (str.substring(i, i + 1).equals(str.substring(length - i - 1, length - i))) i++;
            else isTrue = false;
        }
        System.out.println(isTrue);
    }
}
