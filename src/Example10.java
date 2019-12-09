//Write a Java program to convert a binary number to hexadecimal number
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter binary Number : ");
        long binaryNumber = in.nextLong();
        System.out.println("Hexadecimal Number is : "+ hexNumber(decimalNumber(binaryNumber)));
    }

    private static String hexNumber(int decimalNum){
         String[] tempArray = new String[20];
         String[] hexNumber = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
         int temp,i=0;
         while (decimalNum > 0){
             temp = decimalNum % 16;
             tempArray[i++]= hexNumber[temp];
             decimalNum /= 16;
         }
         String str;
         StringBuilder result = new StringBuilder();
         for (int k = i-1 ; k>=0 ; k-- ){
             str=tempArray[k];
             result.append(str);
         }

         return String.valueOf(result);
     }

    private static int decimalNumber (long num){
        int decimalNumber = 0;
        int powTwo = 1;
        int carry;
        while (num != 0){
            carry = (int)(num % 10) ;
            decimalNumber += (carry * powTwo);
            powTwo *= 2;
            num /= 10;
        }
        return decimalNumber;
    }
}
