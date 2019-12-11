//Write a Java program to find the penultimate (next to last) word of a sentence.
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter your sentence : ");
        String str = in.nextLine();
        String[] words = str.split("[ ]+");
        System.out.println(words[words.length-2]);
    }
}
