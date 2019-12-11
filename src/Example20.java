/*Write a Java program to create a new string of n copies of the last 3 characters of the original string.
The length of the original string must be 3 and above.*/
import java.util.Scanner;

public class Example20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = in.nextLine();
        System.out.println("Enter number of copies");
        int num = in.nextInt();
        String substring = str.substring(str.length() - 3);
        StringBuilder temp= new StringBuilder();
        for (int i = 0 ; i < num ; i++)
            temp.append(substring);
        System.out.println(temp);
    }
}
