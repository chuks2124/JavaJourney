package Chapter5;
import java.util.Scanner;
public class Extremes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int inputs = 1;
        System.out.println("How many numbers are you inputing?");
        int number = input.nextInt();

        while (inputs <= number){

            System.out.println("input number: ");
            int value = input.nextInt();

            if (value > largest){
                largest = value;
            }
            if (value < smallest) {

                    smallest= value;

            }

            inputs += 1;

        }
        System.out.printf("Smallest and largest numbers are: %d and %d%n", smallest, largest);
        int sum = largest + smallest;
        System.out.printf("%nSum of largest and smallest is %d", sum);
    }
}
