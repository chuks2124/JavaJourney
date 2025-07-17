package Chapter2;

import java.util.Scanner;
public class Welcome6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int number1 = input.nextInt();
        System.out.print("Enter second integer:");
        int number2 = input.nextInt();
        System.out.print("Enter third integer:");
        int number3 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if(number1 != number3)
            System.out.printf("%d != %d%n",number1,number3);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number2 > number3)
            System.out.printf("%d > %d%n", number2, number3);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number3 >= number1)
            System.out.printf("%d >= %d%n", number3, number1);


    }
}
