package Chapter4;
import java.util.Scanner;
public class ClassAnalysis {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentcounter = 1;
         while (studentcounter <= 10){
             System.out.println("Enter student results,1 for pass and 2 for fail: ");
             int result = input.nextInt();
             studentcounter += 1;

             if (result == 1){
                 passes += 1;
             }
             else failures += 1;
         }
        System.out.printf("Students recorded %d passes and %d failures%n", passes, failures);
         if (passes >= 8){
             System.out.println("bonus to instuctor");
         }
    }
}
