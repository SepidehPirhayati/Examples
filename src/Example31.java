/*Write a Java program to count the two elements differ by 1 or
less of two given arrays of integers with same length.*/
import java.util.Scanner;

public class Example31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputArray1 = Example28.inputArray(in);
        System.out.println("Second array should have same size with fist array. ");
        int[] inputArray2 = Example28.inputArray(in);
        int count = 0;
        if(inputArray1.length == inputArray2.length) {
            for (int i = 0; i < inputArray1.length; i++){
                int sub = inputArray1[i] - inputArray2[i];
                sub = (sub >= 0) ? sub : -sub;
                if(sub == 1)
                    count++;
            }
        }
        System.out.println("Result is : " + count);
    }
}
