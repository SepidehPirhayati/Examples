/*Write a Java program to take the last three characters from a given string
and add the three characters at both the front and back of the string.
String length must be greater than three and more.*/
import java.util.Scanner;

public class Example23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = in.nextLine();
        String substring = str.substring(str.length()-3);
        System.out.println(substring + str + substring);
    }
}
