package Chapter2;

import java.util.Scanner;
public class Welcome5  {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int number1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int number2 = input.nextInt();
    int sum = number1 + number2;
    System.out.printf("Sum is %d%n", sum);
    }
}
