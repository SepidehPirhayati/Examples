//Write a program in Java to display the pattern like a diamond
import java.util.Scanner;

public class Example41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 1 ; i <= num ; i++){
            int k = 2*i-1;
            for (int j = 1 ; j <= num - i ; j++ ){
                System.out.print(" ");
            }
            while (k>0){
                System.out.print("*");
                k--;
            }
            System.out.println();
        }
        for(int i = num-1 ; i > 0 ; i--){
            int k = 2*i-1;
            for (int j = 1 ; j<= num-i ;  j++){
                System.out.print(" ");
            }
            while (k>0){
                System.out.print("*");
                k--;
            }
            System.out.println();
        }
    }
}
