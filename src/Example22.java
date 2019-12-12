//Write a Java program to rotate an array of integers in left direction.
import java.util.Arrays;
import java.util.Scanner;

public class Example22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input data like sample1,sample2,... : ");
        String array = in.nextLine();
        String[] split = array.split(",");
        String  firstElement = split[0];
        String[] newArray = new String[split.length];
        int lastIndex =  newArray.length-1;
        for (int i = 0 ; i < lastIndex ; i++ ){
            newArray[i] = split[i+1];
        }
        newArray[lastIndex] = firstElement;
        System.out.println("Rotated array is : " + Arrays.toString(newArray));
    }
}
