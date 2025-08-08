package Chapter4;
import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int total = 0;
       int gradecounter = 0;

       while (gradecounter <= 10){
           System.out.println("enter student grade: ");
           int grade = input.nextInt();
           total = total + grade;
           gradecounter = gradecounter + 1;
       }
       int average = total / 10;
        System.out.printf("Total grade of 10 students is:%d ",total);
       System.out.printf("%n Class of 10 students is: %d",average);
    }
}
