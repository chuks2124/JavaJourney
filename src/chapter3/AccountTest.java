package chapter3;

import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Peter Parker", 50.00);
        Account account2 = new Account("Harry Osborne", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
         depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%n removing %.2f from account1 balance%n%n", withdrawalAmount);
        account1.withdraw(withdrawalAmount);

        System.out.print("Enter withdrawal amount for account2: ");
         withdrawalAmount = input.nextDouble();
        System.out.printf("%n removing %.2f from account2 balance%n%n", withdrawalAmount);
        account2.withdraw(withdrawalAmount);

        displayAccount(account1);
        displayAccount(account2);


    }
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $%.2f%n",accountToDisplay.getName(),accountToDisplay.getBalance());
    }
}



