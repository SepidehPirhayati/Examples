/*Write a Java program that keeps a number from the user and
generates an integer between 1 and 7 and displays the name of the weekday.*/
import java.util.Scanner;

public class Example38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7 : ");
        int dayNum = scanner.nextInt();
        if(dayNum > 0 && dayNum < 8) {
            if (dayNum == 1)
                System.out.println("Monday");
            else if (dayNum == 2)
                System.out.println("Tuesday");
            else if(dayNum == 3)
                System.out.println("Wednesday");
            else if(dayNum == 4)
                System.out.println("Thursday");
            else if(dayNum == 5)
                System.out.println("Friday");
            else
                System.out.println("Saturday");
        }
    }
}
