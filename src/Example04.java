//Write a Java program to print an American flag on the screen
public class Example04 {
    public static void main(String[] args) {
        for (int i = 1 ; i<=9 ; i++ ){
            if(i%2==1)
                for (int j = 1 ; j <=6 ; j++)
                    System.out.print("* ");
            else{
                System.out.print(" ");
                for (int j = 1 ; j <=5 ; j++ ){
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            for (int j = 1 ; j<=37 ;j++)
                System.out.print("=");
            System.out.println();
        }

        for (int i = 1 ; i <=6; i++){
            for (int j=1 ; j < 50 ; j++)
                System.out.print("=");
            System.out.println();
        }
    }
}
