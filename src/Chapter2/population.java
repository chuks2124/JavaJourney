package Chapter2;
public class population {
    public static void main(String[] args){
        double G = 8234738256.0;
       double R = 0.0085;
        double year1 = G * Math.pow((1 + R), 1);
       double year2 = G * Math.pow((1 + R), 2);
        double year3 =G * Math.pow((1 + R), 3);
        double year4 =G * Math.pow((1 + R), 4);
        double year5 = G * Math.pow((1 + R), 5);
        System.out.println("the current world population is: "+G +" people");
        System.out.println("the Growth rate is: "+R);
        System.out.println("the current world population for first year is: "+year1 +" people");
        System.out.println("the current world population for second year is: "+year2 +" people");
        System.out.println("the current world population for third year is: "+year3 +" people");
        System.out.println("the current world population for fourth year is: "+year4 +" people");
        System.out.println("the current world population for fifth year is: "+year5 +" people");




    }
}
