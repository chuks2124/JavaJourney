package chapter3;
import java.util.Scanner;
public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase purchase1 = new PetrolPurchase("", "", 0, 0.00, 0.00);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase location: ");
        String location = input.nextLine();
        purchase1.setLocation(location);
        System.out.println("Enter purchase petrol type: ");
        String petrolType = input.nextLine();
        purchase1.setPetrolType(petrolType);
        System.out.println("Enter purchase quantity: ");
        int quantity = input.nextInt();
        purchase1.setQuantity(quantity);
        System.out.println("Enter purchase price: ");
        double price = input.nextDouble();
        purchase1.setPrice(price);
        System.out.println("Enter purchase dicount: ");
        double discount = input.nextDouble();
        purchase1.setDiscount(discount);
        System.out.printf("The purchase was made in %s ", purchase1.getLocation());
        System.out.printf("of petrol type %s ",purchase1.getPetrolType());
        System.out.printf("with quantity %f Litres ",purchase1.getQuantity());
        System.out.printf("at $ %f ",purchase1.getPrice());
        System.out.printf("with a discount of %f  %n", purchase1.getDiscount());
        System.out.printf("The net purchase amount is:%f", purchase1.getpurchaseAmount());

    }
}
