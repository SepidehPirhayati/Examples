//Write a Java program to find the second largest element in an array.
import java.util.Arrays;

public class Example46 {
    public static void main(String[] Strings) {
        int[] array = {67,90,49,89,2003,204,1000,50000,56,90};
        System.out.println(Arrays.toString(array));
        int max,secondMax;
        if(array[0] > array[1]){
            max = array[0];
            secondMax = array[1];
        }else {
            max = array[1];
            secondMax = array[0];
        }
        for (int value : array) {
            if (value > max) {
                int temp = max;
                max = value;
                secondMax = temp;
            } else if (value > secondMax && value < max)
                secondMax = value;
        }
        System.out.println("Second largest element is : " + secondMax);
    }
}
