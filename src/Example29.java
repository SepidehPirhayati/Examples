/*Write a Java program to check if the value 20 appears three times and
no 20’s are next to each other in an given array of integers.*/
import java.util.Scanner;

public class Example29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = Example28.inputArray(in);
        int val = 20;
        int count = 0;
        boolean flag = false;

        if(nums.length > 2) {
            for (int i = 0; i < nums.length -1 ; i++) {
                if (nums[i] == val && nums[i+1] == val)
                    break;
                if (nums[i] == val)
                    count++;
                if (count == 3) {
                    flag = true;
                    break;
                }
            }
        }
        if(count == 2 && nums[nums.length-1] == val)
            flag = true;
        System.out.println(flag);
    }
}
