package Chapter4;

public class StudentTest {
    public static void main(String[] args){
        Student StudentTest1 = new Student("chuks david", 84.65);
        Student StudentTest2 = new Student("obi jackson",54.43);
        System.out.printf("%s grade is %s%n",StudentTest1.getName(),StudentTest1.getGradeletter());
        System.out.printf("%s grade is %s%n",StudentTest2.getName(),StudentTest2.getGradeletter());

    }
}
