//Write a Java program to capitalize the first letter of each word in a sentence.
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Sentence : ");
        String str = in.nextLine();
        Scanner strScan = new Scanner(str);
        StringBuilder upperStr = new StringBuilder(" ");

        while (strScan.hasNext()){
            String word = strScan.next();
            upperStr.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(upperStr.toString().trim());

    }
}
