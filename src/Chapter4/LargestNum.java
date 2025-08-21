package Chapter4;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = 0;

        while (counter <= 10){
            counter += 1;
            System.out.println("Enter number: ");
            int number = input.nextInt();
            if (number > largest){
                largest = number;

            }
        }

        System.out.printf("The largest number of these is: %d", largest);

    }
}
