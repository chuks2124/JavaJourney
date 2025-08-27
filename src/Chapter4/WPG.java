package Chapter4;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class WPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 1;
        long wp = 8200000000L;
        long dp = 16400000000L;
        long p = 17000000000L;
        double gwr = 0.0085;
        System.out.println("Year   population   population increase");
        while (year <= 75){
            double growth = (wp * (1 + gwr));
            long np = (long) growth;
            long increase = np - wp;
            System.out.printf("%d   %.0f   %d%n", year, growth, increase);
            year += 1;
            wp = np;

        }
        long pop = 8235252251L;
        int yearr = 0;
        double rate = 0.0085;
        long doublep = (2 * pop);

        while (pop < doublep) {
            long popu = (long)(pop * rate);
            pop += popu;
            yearr++;
        }
        System.out.println(" ");
        System.out.println("The Population doubles after " + yearr + " years.");




    }
}
