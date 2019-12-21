//Write a Java program to check if an array of integers contains three increasing adjacent numbers.
import java.util.Scanner;

public class Example34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputArray = Example28.inputArray(in);
        boolean isTrue = false;
        for (int i = 0; i < inputArray.length-3; i++) {
            int sub = inputArray[i + 1] - inputArray[i];
            if( inputArray[i+2] - inputArray[i+1] == sub &&  inputArray[i+3] - inputArray[i+2] == sub){
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);
    }
}
