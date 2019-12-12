/*Write a Java program than read an integer and calculate the sum of its digits and
write the number of each digit of the sum in English.*/
import java.util.Scanner;

public class Example25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = in.nextInt();
        int[] digits = separatedNumber(num);
        int sum = sumDigit(digits);
        System.out.println("sum of the digits of the number : " + sum);
        digits= separatedNumber(sum);
        letterOfSum(digits);
    }

    private static int[] separatedNumber(int number){
        int i = 0;
        int[] digits = new int[10];
        while (number != 0){
            digits[i] = number % 10;
            number /= 10;
            i++;
        }
        int[] newDigits = new int[i];
        for (int j = 0 ; j < i ; j++){
             newDigits[j]=digits[j];
        }
        return newDigits;
    }
    private static int sumDigit(int[] digits){
        int sum = 0;
        for (int k : digits)
            sum +=k;
        return sum;
    }

    private static void letterOfSum(int[] digits){
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int index;
        for(int i = digits.length-1; i >= 0 ; i--){
            index= digits[i];
            System.out.print(numbers[index] + " ");
        }
    }
}
