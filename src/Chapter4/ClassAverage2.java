package Chapter4;
import java.util.Scanner;
public class ClassAverage2 {
    public static void main(String[] args){
        int total = 0;
        int gradecounter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1){
            total = total + grade;
            gradecounter = gradecounter + 1;

            System.out.println("Enter student grade or -1 to quit: ");
            grade = input.nextInt();
        }


        if (gradecounter != 0){
            double average = (double) total /gradecounter;
                System.out.printf("Total grade of %d students is: %d%n",gradecounter, total);
                System.out.printf("Average of %d students is: %.2f%n",gradecounter, average);
            }
            else System.out.println("No grades were entered");
        }
    }

