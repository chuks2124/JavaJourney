package Chapter4;
import java.util.Scanner;
public class LargestNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest1 = 0;
        int largest2 = 0;
        int counter = 1;



        while (counter <= 10) {
            counter += 1;
            System.out.println("Enter number in ascending order only: ");
            int number = input.nextInt();



                if (largest1 < number) {
                    largest2 = largest1;
                    largest1 = number;
                }
             else if (number == number) {
                largest2 = largest2;
                largest1 = largest1;
                System.out.println("Invalid input");
                counter -= 1;
            }



        }
        System.out.printf("The largest numbers are %d and %d%n", largest1, largest2);
    }
}

