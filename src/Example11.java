//Write a Java program to reverse a string
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = in.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1 ; i >=0 ;i--)
            stringBuilder.append(str.charAt(i));
        System.out.println(stringBuilder);
    }
}
