//Write a Java program to find smallest and second smallest elements of a given array.
import java.util.Arrays;

public class Example47 {
    public static void main(String[] args) {
        int[] array = {67,90,49,89,2003,204,50000,56,90};
        System.out.println(Arrays.toString(array));
        int min,secondMin;
        if(array[0] < array[1]){
            min = array[0];
            secondMin = array[1];
        }else {
            min = array[1];
            secondMin = array[0];
        }
        for (int value : array) {
            if (value < min) {
                int temp = min;
                min = value;
                secondMin = temp;
            } else if (value < secondMin && value > min)
                secondMin = value;
        }
        System.out.println("Second smallest element is : " + secondMin);
        System.out.println("smallest element is : " + min);
    }

}
