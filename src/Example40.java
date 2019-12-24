//Write a program in Java to print the Floyd's Triangle.
import java.util.Scanner;

public class Example40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input rows : ");
        int row = in.nextInt();
        for(int i = 1 ; i <= row ; i++){
            for (int j = 1; j <= i ; j++){
                if(i%2 == 0){
                    if(j%2 == 0)
                        System.out.print("1");
                    else
                        System.out.print("0"); }
                else{
                    if(j%2 == 0)
                        System.out.print("0");
                    else
                        System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}