/*Write a Java program to arrange the elements of a given array of integers
where all negative integers appear before all the positive integers.*/
import java.util.Arrays;

public class Example48 {
    public static void main(String[] args) {
        int[] array = {0,1,-3,5,2,-7,1,2,-5,8,-9};
        int j;
        for (int i = 0; i< array.length ; i++){
            j=i;
            while(j > 0 && array[j] < 0 && array[j-1] >= 0){
                int temp  = array[j];
                array[j]= array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
