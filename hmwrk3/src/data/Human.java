package hmwrk3.src.data;

public class Human {

    private String firstName;
    private String secondName;
    private String gender;
    private String age;

    public Human(String firstName, String secondName, String gender, String age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
    }

    public Human() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "(имя: " + firstName + " фамилия: " + secondName + " пол: " + gender + " возраст: " + age +")";
    }
}
