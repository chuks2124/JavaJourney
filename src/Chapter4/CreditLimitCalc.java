package Chapter4;
import java.util.Scanner;
public class CreditLimitCalc {
    public static void main(String[] args){
        int charges = 2;
        int customer = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter new customer?(Yes/No): ");
        String cust = input.nextLine();
        System.out.println("Enter account number: ");
        int account = input.nextInt();
        System.out.println("Enter beginning of the month balance: ");
        int balance1 = input.nextInt();
        System.out.println("Enter total of all items charged this month: ");
        int totalI = input.nextInt();
        System.out.println("Enter total of all credits applied to this account this month: ");
        int credits = input.nextInt();
        System.out.println("Enter allowed credit limit");
        int limit = input.nextInt();

        while (cust != "No") {
            double balance = (double) balance1 + charges - credits;
            customer += 1;

            System.out.print("Enter new customer?(Yes/No): ");
            cust = input.nextLine();
            System.out.println("Enter account number: ");
            account = input.nextInt();
            System.out.println("Enter beginning of the month balance: ");
            balance1 = input.nextInt();
            System.out.println("Enter total of all items charged this month: ");
            totalI = input.nextInt();
            System.out.println("Enter total of all credits applied to this account this month: ");
            credits = input.nextInt();
            System.out.println("Enter allowed credit limit");
            limit = input.nextInt();

            System.out.printf("The new balance of this customer is: %.2f", balance);

            if (balance < credits){
                System.out.println("Credit limit exceeded");
            }

        }

    }
}
