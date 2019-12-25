//Write a java program to generate a following *'s triangle
import java.util.Scanner;

public class Example42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for(int i = row; i > 0; i--){
            int k =i;
            for (int j = 1 ; j <= row - i; j++){
                System.out.print(" ");
            }
            while (k>0)
            {
                System.out.print("*");
                k--;
            }
            System.out.println();
        }
    }
}
