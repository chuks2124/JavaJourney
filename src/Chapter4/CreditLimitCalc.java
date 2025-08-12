package Chapter4;
import java.util.Scanner;
public class CreditLimitCalc {
    public static void main(String[] args){
        int account = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter account number or -1 to quit: ");
         account = input.nextInt();

        while (account != -1) {
            System.out.println("Enter beginning of the month balance: ");
            int balance1 = input.nextInt();
            System.out.println("Enter total of all items charged this month: ");
            int charges = input.nextInt();
            System.out.println("Enter total of all credits applied to this account this month: ");
            int credits = input.nextInt();
            System.out.println("Enter allowed credit limit");
            int limit = input.nextInt();

            double balance = (double) (balance1 + charges - credits);
            System.out.printf("The new balance of this customer is: %.2f%n", balance);

            if (balance < credits){
                System.out.println("Credit limit exceeded");

                System.out.println("Enter account number or -1 to quit: ");
                account = input.nextInt();
            }

        }

    }
}
