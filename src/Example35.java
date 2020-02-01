//Write a Java program to check whether an given integer is a power of 4 or not.
import java.util.Scanner;

public class Example35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();
        boolean isTrue = true;
        if(num < 4)
            System.out.println(false);
        else{
            while(num != 1 && isTrue){
                if (num % 4 != 0) {
                    isTrue = false;
                }
                num /= 4;
            }
        }
        System.out.println(isTrue);
    }
}
