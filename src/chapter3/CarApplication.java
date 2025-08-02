package chapter3;
import java.util.Scanner;
public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "2009", 4000);
        Car car2 = new Car("Audi", "2012", 8000);
        Scanner input = new Scanner(System.in);
        System.out.printf("This car is a %s of the year %s worth %.2f%n", car1.getModel(), car1.getYear(),car1.getPrice());
        System.out.printf("This car is a %s of the year %s worth %.2f%n", car2.getModel(), car2.getYear(),car2.getPrice());

        System.out.print("Enter discount amount for car1: ");
        double discountAmount = input.nextDouble();
        System.out.printf("%n removing %.2f percent discount from car1 price%n", discountAmount);
        car1.discount(discountAmount);

        System.out.print("Enter discount amount for car2: ");
         discountAmount = input.nextDouble();
        System.out.printf("%n removing %.2f percent discount from car2 price%n", discountAmount);
        car2.discount(discountAmount);

        System.out.printf("This car is a %s of the year %s worth %.2f%n", car1.getModel(), car1.getYear(),car1.getPrice());
        System.out.printf("This car is a %s of the year %s worth %.2f%n", car2.getModel(), car2.getYear(),car2.getPrice());

    }
}
