/*Write a Java program start with an integer n, divide n by 2 if n is even or
multiply by 3 and add 1 if n is odd,repeat the process until n = 1.*/
import java.util.Scanner;

public class Example24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();
        while (num != 1){
            System.out.println(num);
            if (num % 2 == 0)
                num /=2 ;
            else
                num = (num * 3 + 1) / 2;
        }
    }
}