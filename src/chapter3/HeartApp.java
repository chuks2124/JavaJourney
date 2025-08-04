package chapter3;
import java.util.Scanner;
public class HeartApp {
    public static void main(String[] args){
        HeartRates HeartApp = new HeartRates("", "",0, 0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String firstname = input.nextLine();
        HeartApp.setFirstname(firstname);

        System.out.println("Enter Last name");
        String lastname = input.nextLine();
        HeartApp.setLastname(lastname);

        System.out.print("Enter Day of birth: ");
        int dayOfBirth = input.nextInt();
        HeartApp.setDayOfBirth(dayOfBirth);

        System.out.print("Enter Month of birth: ");
        int monthOfBirth = input.nextInt();
        HeartApp.setMonthOfBirth(monthOfBirth);

        System.out.print("Enter Year of birth: ");
        int yearOfBirth = input.nextInt();
        HeartApp.setYearOfBirth(yearOfBirth);

        System.out.printf("D.O.B: %.0f/%.0f/%.0f%n", HeartApp.getDayOfBirth(),HeartApp.getMonthOfBirth(), HeartApp.getYearOfBirth());

        int A = 2025 - yearOfBirth;
        // A = Age
        int M = 220 - A;
        // M  = Maximum heart rate
        double T = (M * 67.5)/100;
        // T  = Target heart rate

        System.out.println("Age is: "+ A);
        System.out.println("Maximum Heart-rate is: "+ M);
        System.out.println("Target Heart-rate is: "+ T);
    }
}
