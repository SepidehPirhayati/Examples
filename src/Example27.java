/*Write a Java program to rearrange all the elements of an given array of integers
so that all the odd numbers come before all the even numbers.*/
import java.util.Arrays;

public class Example27 {
    public static void main(String[] args) {
        int[] array = {10, 70, 8, 5, 7, 13, 0, 2, 4, 9};
        System.out.println(Arrays.toString(array));
        int i =0;

        for(int j = i+1; j < array.length; j++){
            if(array[j] % 2 != 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}