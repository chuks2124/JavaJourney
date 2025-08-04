package chapter3;

public class HealthProfile {
    private String firstname;
    private String lastname;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int height;
    private int weight;

    public HealthProfile(String firstname, String lastname, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, int height, int weight){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void setDayOfBirth(int dayOfBirth) {
        if (dayOfBirth > 0)
            this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }
    public void setMonthOfBirth(int monthOfBirth) {
        if (monthOfBirth > 0)
            this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0)
            this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}


