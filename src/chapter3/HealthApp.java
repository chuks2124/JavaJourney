package chapter3;

import java.util.Scanner;

public class HealthApp {
    public static void main(String[] args){
        HealthProfile HealthApp = new HealthProfile("", "","", 0, 0, 0,0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String firstname = input.nextLine();
        HealthApp.setFirstname(firstname);

        System.out.println("Enter Last name");
        String lastname = input.nextLine();
        HealthApp.setLastname(lastname);

        System.out.println("Enter Gender: ");
        String gender = input.nextLine();
        HealthApp.setGender(gender);

        System.out.print("Enter Day of birth: ");
        int dayOfBirth = input.nextInt();
        HealthApp.setDayOfBirth(dayOfBirth);

        System.out.print("Enter Month of birth: ");
        int monthOfBirth = input.nextInt();
        HealthApp.setMonthOfBirth(monthOfBirth);

        System.out.print("Enter Year of birth: ");
        int yearOfBirth = input.nextInt();
        HealthApp.setYearOfBirth(yearOfBirth);

        System.out.print("Enter height: ");
        int height = input.nextInt();
        HealthApp.setHeight(height);

        System.out.print("Enter weight: ");
        int weight = input.nextInt();
        HealthApp.setWeight(weight);

        System.out.printf("D.O.B: %d/%d/%d%n", HealthApp.getDayOfBirth(),HealthApp.getMonthOfBirth(), HealthApp.getYearOfBirth());
        System.out.println("Height: "+height+" inches");
        System.out.println("Weight: "+weight+" pounds ");

        int A = 2025 - yearOfBirth;
        // A = Age
        int M = 220 - A;
        // M  = Maximum heart rate
        double T = (M * 67.5)/100;
        // T  = Target heart rate
        int BMI = weight * 703 / (height * height);

        System.out.println("Age is: "+ A+"years");
        System.out.println("Maximum Heart-rate is: "+ M);
        System.out.println("Target Heart-rate is: "+ T);
        System.out.println("BMI is: "+ BMI);
    }
}


