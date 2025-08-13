package Chapter4;
import java.util.Scanner;
public class TaxCalc {
    public static void main(String[] args){
        int citizens = 1;
        double Tax1 = 0.15;
        double Tax2 = 0.20;
        Scanner input = new Scanner(System.in);


        while (citizens <= 3){
            double totalTax = 0.00;
            System.out.println("Enter citizen name: ");
            String citizenName = input.next();
            System.out.println("Enter earnings: ");
            double earnings = input.nextDouble();
            citizens += 1;



            if (earnings <= 30000.00){
                totalTax= earnings * Tax1;
            }
            else{
                totalTax += earnings * Tax2;
            }
            System.out.printf("Your Total Tax is: %.2f%n", totalTax);


        }
    }
}
