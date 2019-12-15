/*Write a Java program to check if an array of integers contains a specified number
next to each other or there are two same specified numbers separated by one element.*/
import java.util.Scanner;

public class Example28 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter array of integer like 2 3 4 5 6 ... : " );
        String array = in.nextLine();
        System.out.println("Enter specified number : ");
        int num = in.nextInt();
        String[] splits = array.split(" ");
        int[] nums = new int[splits.length];
        int i = 0;
        boolean flag = false;
        for (String str:splits) {
            nums[i++]=Integer.parseInt(str);
        }
        for (int j = 0 ; j < nums.length-1 ; j++){
            if (nums[j] == num && nums[j + 1] == num) {
                flag = true;
                break;
            }
            if (j < nums.length-2 && nums[j] == num &&  nums[j + 2] == num) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
