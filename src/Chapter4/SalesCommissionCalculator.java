package Chapter4;
import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args){
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        double total = 0.00;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item number or -1 to quit: ");
        int item = input.nextInt();

        while (item != -1){
            System.out.println("Enter quantity of items: ");
            int quantity = input.nextInt();
            if (item == 1){
                total += quantity * item1;
            } else if (item == 2) {
                total += quantity * item2;
            } else if (item == 3) {
                total += quantity * item3;
            } else if (item == 4) {
                total += quantity * item4;
            }
            else {
                System.out.println("Invalid input");
            }
            System.out.println("Enter item number or -1 to quit: ");
            item = input.nextInt();

        }
        double wage = 200 + (total * 0.09);
        System.out.printf("This salesperson receives the sum of $%.2f this week", wage);
    }
}
