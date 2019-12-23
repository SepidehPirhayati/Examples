//Write a Java program that searches a value in an m x n matrix.
import java.util.Scanner;

public class Example37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter target number : ");
        int target = in.nextInt();
        int [][] matrix = new int[3][3];
        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                matrix[i][j] = i*3 + j + 1;
            }
        }
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(findTarget(matrix, target));
    }
    private static boolean findTarget(int[][] matrix , int target){
        boolean isTrue = false;
        for (int i = 0 ; i < 3 ; i++ ){
            for(int j = 0 ; j < 3 ; j++){
                if(matrix[i][j] == target){
                    isTrue = true;
                    break;
                }
            }
        }
        return isTrue;
    }
}
