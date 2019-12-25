//Write a java program to display the number rhombus structure
import java.util.Scanner;

public class Example44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            int k = 2 * i - 1;
            int c1 = i;
            int c2 = 1;
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            while (k > 0) {
                if (c1 > 0)
                    System.out.print(c1--);
                else {
                    if (c2 <= i)
                        System.out.print(++c2);
                }
                k--;
            }
            System.out.println();
        }
        for (int i = num - 1; i > 0; i--) {
            int k = 2 * i - 1;
            int c1 = i;
            int c2 = 1;
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            while (k > 0) {
                if (c1 > 0)
                    System.out.print(c1--);
                else {
                    if (c2 <= i)
                        System.out.print(++c2);
                }
                k--;
            }
            System.out.println();
        }
    }
}
