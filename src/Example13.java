/*Write a Java program to find the number of integers within the range of
 two specified numbers and that are divisible by another number*/
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();
        System.out.println("Enter another number : ");
        int num = in.nextInt();
        int count = 0;
        if (num1 > num2) {
            for (int i = num1 ; i >= num2 ; i--){
                if(i%num==0){
                    count++;
                }
            }
        }else {
            for (int i = num1 ; i <= num2 ; i++){
                if(i%num==0){
                    count++;
                }
            }
        }
        System.out.println("Result is : " + count);
    }
}
