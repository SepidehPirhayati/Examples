/*Write a Java program to check if a specified number appears in
every pair of adjacent element of a given array of integers.*/
import java.util.Scanner;

public class Example30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputArray = Example28.inputArray(in);
        System.out.println("Enter number : ");
        int val = in.nextInt();
        int i = 0;
        boolean flag = false;
        while (i < inputArray.length-1){
            if(inputArray[i] == val || inputArray[i+1] == val){
                i++;
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
