//Write a Java program to insert a word in the middle of the another string.
import java.util.Scanner;

class Example19 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Sentence : ");
       String str = in.nextLine();
       System.out.println("Enter word : ");
       String word = in.nextLine();
       String[] split = str.split("[ ]+");
       int i = split.length / 2;
       int j = 0;
       StringBuilder temp = new StringBuilder(" ");
       for (int k = i ; k <split.length ; k++){
           temp.append(split[k]).append(" ");
       }
       Scanner strScan = new Scanner(str);
       StringBuilder stringBuilder = new StringBuilder();
       while(!strScan.next().equals(split[i])){
           stringBuilder.append(split[j]).append(" ");
           j++;
       }
       stringBuilder.append(word).append(temp);
       System.out.println(stringBuilder);
    }
}
