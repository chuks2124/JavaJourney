package Chapter4;

public class Increment {
    public static void main(String[] args){
        int c = 5;
        System.out.printf("c before postincrement: %d%n",c);
        System.out.printf("c postincrementing: %d%n",c++);
        System.out.printf("c after postincrementing: %d%n",c);


        System.out.println();


        c = 5;
        System.out.printf("c before preincrement: %d%n",c);
        System.out.printf("c preincrementing: %d%n",++c);
        System.out.printf("c after postincrementing: %d%n",c);
    }
}
