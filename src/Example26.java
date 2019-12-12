//Write a Java program to measure how long some code takes to execute in nanoseconds.

public class Example26 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Estimated Time : " + estimatedTime + " ns");
    }
}