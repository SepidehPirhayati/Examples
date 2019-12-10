//Write a Java program to convert seconds to hour, minute and seconds.
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input time in seconds : ");
        int time = in.nextInt();
        int h, m, s;
        h=time/3600; // hour
        time%=3600;
        m=time/60; // minute
        time%=60;
        s=time; // second
        System.out.println("Converted Time-> "+ h +":"+ m + ":" + s );
    }
}
