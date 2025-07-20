package Chapter2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter weight in kilograms: ");
        int a = input.nextInt();
        System.out.print("Enter height in meters: ");
        int b = input.nextInt();
        int BMI = a/(b*b);
        System.out.printf("%d",BMI);
    }
}
