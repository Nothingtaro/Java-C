public class Person {
    private String firstName, lastName;

    static {
        System.out.println("Static initializer was called.");
    }
    /* Static initializer (class constructor)
       will show only the first time after a class load it. */

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        System.out.println("Person constructor a was called.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
