package chapter3;

public class HeartRates {
    private String firstname;
    private String lastname;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstname, String lastname, int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this.firstname = firstname;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }
    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setDayOfBirth(int dayOfBirth) {
        if (dayOfBirth > 0)
            this.dayOfBirth = dayOfBirth;
    }

    public double getDayOfBirth() {
        return dayOfBirth;
    }
    public void setMonthOfBirth(int monthOfBirth) {
        if (monthOfBirth > 0)
            this.monthOfBirth = monthOfBirth;
    }

    public double getMonthOfBirth() {
        return monthOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0)
            this.yearOfBirth = yearOfBirth;
    }

    public double getYearOfBirth() {
        return yearOfBirth;
    }
}
