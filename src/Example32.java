/*Write a Java program to create a new array from a given array of integers,
new array will contain the elements from the given array after the last element value 10.*/
import java.util.Arrays;
import java.util.Scanner;

public class Example32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("The array must have element 10");
        int[] inputArray = Example28.inputArray(in);
        int i ;
        int length = inputArray.length;
        boolean flag = false;
        for (i = length-1; i >= 0; i--) {
            if(inputArray[i] == 10){
             flag = true;
             break;
            }
        }
        if(flag){
            int newLength = length - i -1;
            int[] outputArray = new int[newLength];
            for (int j = 0; j < newLength; j++){
                outputArray[j] = inputArray[++i];
            }
            System.out.println(Arrays.toString(outputArray));
        }
        else {
            System.out.println("*** The element 10 did not find! ***");
        }
    }
}
