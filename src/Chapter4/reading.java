package Chapter4;
import java.util.Scanner;
public class reading {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int integer = 0;
        while (number >= integer){
            System.out.println("Add integer: ");
            int integ = input.nextInt();
            integer += integ;
        }
        System.out.printf(" %d is greater than %d",integer,number);
    }
}
