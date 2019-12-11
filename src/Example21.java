/*Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
The strings must not have the same length.*/
import java.util.Scanner;

public class Example21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two string in different length : ");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        if(str1.length() > str2.length())
            System.out.println(str2 + str1 + str2);
        else
            System.out.println(str1 + str2 + str1);
    }
}
