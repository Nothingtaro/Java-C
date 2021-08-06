import java.io.FileReader;

public class Person {
    private String firstName, lastName, nickName, gender;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Person(String firstName, String lastName, String nickName, String gender) {
//        this.firstName = firstName.trim().substring(0,1).toUpperCase() +
//                firstName.trim().substring(1).toLowerCase();
        setFirstName(firstName);
        this.lastName = lastName;
        this.nickName = nickName;
        this.gender = gender;
    }

    // chain constructor -> เรียก constructor ที่มีอยู่ก่อนหน้า (line 4-10)
    public Person(String firstName, String nickName) {
        this(firstName, "", nickName, "");
    }

    public Person(String firstName, String lastName, String gender) {
        this(firstName, lastName, "", gender);
    }

    /*
    public Person(String firstName, String nickName) {
        this.firstName = firstName;
        this.nickName = nickName;
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    */

    // default constructor (parameterless constructor)
    public Person() {
        System.out.println("Person constructor was called.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
//        this.firstName = firstName;
        this.firstName = firstName.trim().substring(0,1).toUpperCase() +
                firstName.trim().substring(1).toLowerCase();;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
