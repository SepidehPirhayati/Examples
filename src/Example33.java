//Write a Java program to check if a group of numbers (length) at the start and end of a given array are same.
import java.util.Scanner;

public class Example33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputArray = Example28.inputArray(in);
        System.out.println("Enter number : ");
        int num = in.nextInt();
        int length = inputArray.length - num ;
        boolean isTrue = false;
        for (int i = 0; i < num; i++){
            if (inputArray[i] == inputArray[length++]) isTrue = true;
            else {
                isTrue = false;
                break;
            }
        }
        System.out.println(isTrue);
    }
}
