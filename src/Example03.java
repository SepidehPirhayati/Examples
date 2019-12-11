//Write a Java program to print the area and perimeter of a circle
import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input radius : ");
        double input = in.nextDouble();
        System.out.println("Perimeter : " + 2 * Math.PI * input );
        System.out.println("Area : " + Math.PI * input * input);
    }
}
