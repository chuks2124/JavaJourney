package chapter3;
import java.util.Scanner;
public class ClockTest {
    public static void main(String[] args){
        Clock ClockTest = new Clock(00, 00,00);
        Scanner input = new Scanner(System.in);

        System.out.println("input hour:");
        int hour = input.nextInt();
        ClockTest.setHour(hour);

        System.out.println("input minute: ");
        int minute = input.nextInt();
        ClockTest.setMinute(minute);

        System.out.println("set second: ");
        int second = input.nextInt();
        ClockTest.setSecond(second);

        System.out.printf("The Time is: %d:%d:%d",ClockTest.getHour(),ClockTest.getMinute(),ClockTest.getSecond());

    }
}
