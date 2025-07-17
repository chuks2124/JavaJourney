package Chapter2;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer ");
        int integer = input.nextInt();
        System.out.printf("%d%s%n", integer, " was selected");


        System.out.print("Enter Value of c: ");
        int c = input.nextInt();
        System.out.print("Enter Value of b: ");
        int b = input.nextInt();
        int a = b * c;
        System.out.printf("Product is %d%n", a);

        System.out.printf("%d%d%d%d%n", 1, 2, 3, 4);

        System.out.print("Enter first integer: ");
        int d = input.nextInt();

        System.out.print("Enter second integer: ");
        int p = input.nextInt();

        int square1 = d * d;
        int square2 = p * p;
        int sum = square1 + square2;
        int difference = square1 - square2;

        System.out.println("Square of first number: " + square1);
        System.out.println("Square of second number: " + square2);
        System.out.println("Sum of squares: " + sum);
        System.out.println("Difference of squares: " + difference);
        System.out.println("Done");

        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.println("4 ");

        System.out.print("Enter Number: ");
        int e = input.nextInt();
        int squareE = e * e;
        if (squareE == 100)
            System.out.printf("%d == %d%n", squareE, 100);
        if (squareE != 100)
            System.out.printf("%d != %d%n", squareE, 100);
        if (squareE >= 100)
            System.out.printf("%d >= %d%n", squareE, 100);
        if (squareE <= 100)
            System.out.printf("%d <= %d%n", squareE, 100);
        System.out.print("Done");

        System.out.print("Enter first integer: ");
        int o = input.nextInt();
        System.out.print("Enter second integer: ");
        int j = input.nextInt();
        System.out.print("Enter third integer: ");
        int f = input.nextInt();

        int sum1 = o + j + f;
        int difference1 = o - j - f;
        int average = sum1 / 3;
        int product = o * j * f;

        System.out.println("Sum1 is " + sum);
        System.out.println("Difference1 is " + difference);
        System.out.println("Average is " + average);
        System.out.println("Product is " + product);

        int smallest = o;
        if (j < smallest) {
            smallest = f;
        }
        if (f < smallest) {
            smallest = f;
        }
        int largest = o;
        if (j > largest) {
            largest = j;
        }
        if (f > largest) {
            largest = f;
        }
    }
}

