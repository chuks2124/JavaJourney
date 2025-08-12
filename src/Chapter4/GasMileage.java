package Chapter4;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int trips = 0;
        double total = 0;
        System.out.println("Enter miles driven or -1 to quit: ");
        int miles = input.nextInt();

        while (miles != -1){
            System.out.println("Enter gallons used: ");
            int gallons = input.nextInt();
            miles = miles;
            gallons = gallons;
            double MPG = (double) miles / gallons;
            System.out.printf("Miles per gallon of this trip is: %.2f%n",MPG);
            trips += 1;
            total += MPG;

            System.out.println("Enter miles driven or -1 to quit: ");
             miles = input.nextInt();

             if (miles == -1){
                 System.out.printf("Total miles per gallon obtained in these %d trips is: %.2f%n", trips, total);
             }

        }


    }
}
