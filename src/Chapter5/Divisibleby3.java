package Chapter5;

public class Divisibleby3 {
    public static void main(String[] args){
        int number = 1;
        int total = 0;
        while (number <= 30){
            if ((number % 3) == 0){
                total += number;
            }
            number += 1;

        }
        System.out.printf("The sum of numbers from 1-30 divisible by 3 is: %d", total);
    }
}
