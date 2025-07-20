package Chapter2;

public class pyramid {
    public static void main(String[] args){
        double a = 2300000.0;
        // a = number of stones used
        double b = 8.75;
        // b = average weight of stones used
        double c = 24;
        // c = number of years taken to build
        double d = 210240;
        // c = number of hours taken to build
        double e = 12614400;
        // e = number of minutes taken to build
        double f = (a*b);
        // f = total weight of stones
        double g = (f/c);
        // g = total weight built per year
        double h = (f/d);
        // g = total weight built per hour
        double i = (f/e);
        // g = total weight built per minute
        System.out.println("Total weight built each year: "+ g +" tons");
        System.out.println("Total weight built each hour: "+ h +" tons");
        System.out.println("Total weight built each minute: "+ i +" tons");

    }
}
