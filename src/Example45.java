//Write a Java program to display the following character rhombus structure.
import java.util.Scanner;

public class Example45 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            int k = 2 * i - 1;
            char c2 = 'A';
            char c1 = (char) (i+64);
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            while (k > 0) {
                if (c2 <= i+64)
                    System.out.print(c2++);
                else if (c1 > 64)
                        System.out.print(--c1);
                k--;
            }
            System.out.println();
        }
        for (int i = num - 1; i > 0; i--) {
            int k = 2 * i - 1;
            char c2 = 'A';
            char c1 = (char) (i+64);
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            while (k > 0) {
                if (c2 <= i+64)
                    System.out.print(c2++);
                else if (c1 > 64)
                    System.out.print(--c1);
                k--;
            }
            System.out.println();
        }
    }
}
