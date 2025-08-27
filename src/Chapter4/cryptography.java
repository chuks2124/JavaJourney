package Chapter4;
import java.util.Scanner;
public class cryptography {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int integer = input.nextInt();

        while (integer < 1000){
            System.out.println("Invalid number,must be four digits");
            integer = input.nextInt();
        }
        while (integer > 9999){
            System.out.println("Invalid number,must be four digits");
            integer = input.nextInt();
        }
        int first = integer / 1000;
        int second = (integer / 100) % 10;
        int third = (integer / 10) % 10;
        int fourth = integer % 10;

        first =( first +7) % 10;
        second =(second + 7) % 10;
        third =(third + 7) % 10;
        fourth =(fourth + 7) % 10;
        System.out.printf("%d%d%d%d%n", third, fourth, first, second);


    }
}
