//Write a Java program to convert a decimal number to hexadecimal number
import java.util.Scanner;

public class Sample8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int num = in.nextInt();
        String[] tempArray = new String[20];
        String[] hexNumber = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        int temp,i=0;
        while (num > 0){
            temp = num % 16;
            tempArray[i++]= hexNumber[temp];
            num /= 16;
        }
        System.out.println("Result is : ");
        for (int k = i-1 ; k>=0 ; k-- )
            System.out.print(tempArray[k]);
    }
}
