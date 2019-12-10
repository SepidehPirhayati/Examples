//Write a Java program to accepts an integer and count the factors of the number.
import java.util.Scanner;

public class Example14
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();
        int count = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i++) {
            if (num%i == 0 && i*i != num )
                count += 2;
            else if(i*i == num)
                count++;
        }
        System.out.println("Result is : " + count);
    }
}
