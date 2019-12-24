/*Write a program in Java to print such pattern like a pyramid with a number
which will repeat the number in the same row.*/
import java.util.Scanner;

public class Example39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1 ; i <= num ; i++){
            int j;
            int k = i;
                for (j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                while (k>0){
                    System.out.print(i + " ");
                    k--;
                }
            System.out.println();
        }
    }
}