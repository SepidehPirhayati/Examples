//Write a Java program to convert seconds to hour, minute and seconds.
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input time in seconds : ");
        int time = in.nextInt();
        int h, m, s;
        //hour
        h=time/3600;
        time%=3600;
        //minute
        m=time/60;
        time%=60;
        //second
        s=time;
        System.out.println("Converted Time-> "+ h +":"+ m + ":" + s );
    }
}
